/*
Cherry pickup II

Given a n x m 2d integer array called matrix where matrix[i][j] represents the number of cherries you can pick up from
the (i, j) cell.Given two robots that can collect cherries, one is located at the top-leftmost (0, 0) cell and the
other at the top-rightmost (0, m-1) cell.
Return the maximum number of cherries that can be picked by the two robots in total, following these rules:

Robots that are standing on (i, j) cell can only move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1),
if it exists in the matrix.
A robot will pick up all the cherries in a given cell when it passes through that cell.
If both robots come to the same cell at the same time, only one robot takes the cherries.
Both robots must reach the bottom row in matrix.

Example 1:
Input: matrix = [[2, 1, 3], [4, 2, 5], [1, 6, 2], [7, 2, 8]]
Output: 37
Explanation: Possible left robot path:-
Start at 0th cell (2) -> down (4) -> down-right (6) ->down-left (7)
Possible right robot path:-
Start at 2nd cell (3) -> down (5) -> down (2) -> down (8)

Example 2:
Input: matrix = [[1, 4, 4, 1], [1, 2, 2, 1], [5, 6, 10, 11], [8, 1, 1, 1]]
Output: 32
Explanation: Possible left robot path:-
Start at 0th cell (1) -> down-right (2) -> down (6) ->down-left (8)
Possible right robot path:-
Start at 3rd cell (1) -> down-left (2) -> down-right (11) -> down (1)

Example 3:
Input: matrix = [[1, 2, 3], [5, 4, 6], [4, 4, 1]]
Output:
23

Constraints:
n == number of rows in matrix
m == number of columns in matrix
2 <= n, m <= 70
0 <= matrix[i][j] <= 1000
 */

package dp.ThreeD;

public class NinjaAndHisFriend {

    public static int memoization(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][][] dp = new int[row][col][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) dp[i][j][k] = -1;
            }
        }
        return memoizationHelper(matrix, dp, 0, 0, col - 1, row, col);
    }

    public static int memoizationHelper(int[][] matrix, int[][][] dp, int row, int col1, int col2, int r, int c) {
        if (col1 < 0 || col1 >= c || col2 < 0 || col2 >= c) return (int) Math.pow(-10, 9);
        if (row == r - 1) {
            if (col1 == col2)
                return matrix[row][col1];
            else
                return matrix[row][col1] + matrix[row][col2];
        }

        if (dp[row][col1][col2] != -1) return dp[row][col1][col2];


        int maxi = Integer.MIN_VALUE;
        // int[] colDirections = new int[]{-1, 0, 1};
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (col1 == col2)
                    maxi = Math.max(maxi, matrix[row][col1] +
                            memoizationHelper(matrix, dp, row + 1, col1 + i, col2 + j, r, c));
                else
                    maxi = Math.max(maxi, matrix[row][col1] + matrix[row][col2] +
                            memoizationHelper(matrix, dp, row + 1, col1 + i, col2 + j, r, c));
            }
        }
        dp[row][col1][col2] = maxi;
        return dp[row][col1][col2];
    }

    public static int tabulation(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][][] dp = new int[row][col][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j)
                    dp[row - 1][i][j] = matrix[row - 1][i];
                else
                    dp[row - 1][i][j] = matrix[row - 1][i] + matrix[row - 1][j];
            }
        }

        for (int i = row - 2; i >= 0; i--) {
            for (int j1 = 0; j1 < col; j1++) {
                for (int j2 = 0; j2 < col; j2++) {
                    int result = Integer.MIN_VALUE;
                    // Inner loops for 9 combinations
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {

                            // boundary check
                            if (j1 + di >= 0 && j1 + di < col && j2 + dj >= 0 && j2 + dj < col) {
                                if (j1 == j2)
                                    result = Math.max(result, matrix[i][j1] + dp[i+1][j1 + di][j2 + dj]);
                                else
                                    result = Math.max(result, matrix[i][j1] + matrix[i][j2] + dp[i+1][j1 + di][j2 + dj]);
                            }
                        }
                    }
                    dp[i][j1][j2] = result;
                }
            }
        }
        return dp[0][0][col-1];
    }

    public static int tabulationSpaceOptimised(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] prev = new int[col][col];
        int[][] curr = new int[col][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j)
                    prev[i][j]= matrix[row - 1][i];
                else
                    prev[i][j] = matrix[row - 1][i] + matrix[row - 1][j];
            }
        }


        for (int i = row - 2; i >= 0; i--) {
            for (int j1 = 0; j1 < col; j1++) {
                for (int j2 = 0; j2 < col; j2++) {
                    int result = Integer.MIN_VALUE;
                    // Inner loops for 9 combinations
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {

                            // boundary check
                            if (j1 + di >= 0 && j1 + di < col && j2 + dj >= 0 && j2 + dj < col) {
                                if (j1 == j2)
                                    result = Math.max(result, matrix[i][j1] + prev[j1 + di][j2 + dj]);
                                else
                                    result = Math.max(result, matrix[i][j1] + matrix[i][j2] + prev[j1 + di][j2 + dj]);
                            }
                        }
                    }
                    curr[j1][j2] = result;
                }

            }
            int[][] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[0][col-1];
    }
}
