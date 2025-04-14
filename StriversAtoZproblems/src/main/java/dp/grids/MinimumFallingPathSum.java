/*
931. Minimum Falling Path Sum

Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly
below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1),
(row + 1, col), or (row + 1, col + 1).

Example 1:
Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
Output: 13
Explanation: There are two falling paths with a minimum sum as shown.

Example 2:
Input: matrix = [[-19,57],[-40,-5]]
Output: -59
Explanation: The falling path with a minimum sum is shown.

Constraints:
n == matrix.length == matrix[i].length
1 <= n <= 100
-100 <= matrix[i][j] <= 100
 */

package dp.grids;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public static int memoization(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            int[][] dp = new int[r][c];
            for (int[] arr : dp)
                Arrays.fill(arr, Integer.MAX_VALUE);
            min = Math.min(min, memoizationHelper(matrix, dp, r - 1, i));
        }
        return min;
    }

    public static int memoizationHelper(int[][] matrix, int[][] dp, int r, int c) {
        if (c < 0 || c >= matrix[0].length) return (int) Math.pow(10, 9);
        if (r == 0) return matrix[r][c];
        if (dp[r][c] != Integer.MAX_VALUE) return dp[r][c];

        int diagonallyLeftUp = matrix[r][c] + memoizationHelper(matrix, dp, r - 1, c - 1);
        int diagonallyRightUp = matrix[r][c] + memoizationHelper(matrix, dp, r - 1, c + 1);
        int diagonallyUp = matrix[r][c] + memoizationHelper(matrix, dp, r - 1, c);
        dp[r][c] = Math.min(diagonallyUp, Math.min(diagonallyLeftUp, diagonallyRightUp));
        return dp[r][c];
    }

    public static int tabulation(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] dp = new int[r][c];

        for (int j = 0; j < c; j++) {
            dp[0][j] = matrix[0][j]; // Base case: first row
        }

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int diagonallyLeftUp = (int) Math.pow(10, 9);
                if (j > 0)  diagonallyLeftUp = matrix[i][j] + dp[i - 1][j - 1];

                int diagonallyRightUp = (int) Math.pow(10, 9);
                if (j < c - 1) diagonallyRightUp = matrix[i][j] + dp[i - 1][j + 1];

                int diagonallyUp = matrix[i][j] + dp[i - 1][j];
                dp[i][j] = Math.min(diagonallyUp, Math.min(diagonallyLeftUp, diagonallyRightUp));
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            result = Math.min(result, dp[r - 1][i]);
        }
        return result;
    }


    public static int tabulationSpaceOptimized(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] prev = new int[c];

        for (int j = 0; j < c; j++) {
            prev[j] = matrix[0][j]; // Base case: first row
        }

        for (int i = 1; i < r; i++) {
            int[] temp = new int[c];
            for (int j = 0; j < c; j++) {
                int diagonallyLeftUp = (int) Math.pow(10, 9);
                if (j > 0)
                    diagonallyLeftUp = matrix[i][j] + prev[j - 1];

                int diagonallyRightUp = (int) Math.pow(10, 9);
                if (j < c - 1) diagonallyRightUp = matrix[i][j] + prev[j + 1];

                int diagonallyUp = matrix[i][j] + prev[j];
                temp[j] = Math.min(diagonallyUp, Math.min(diagonallyLeftUp, diagonallyRightUp));
            }
            prev = temp;
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            result = Math.min(result, prev[i]);
        }
        return result;
    }
}
