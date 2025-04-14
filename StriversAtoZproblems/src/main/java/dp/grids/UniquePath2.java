/*
63. Unique Paths II

You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either
down or right at any point in time.
An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any
square that is an obstacle.
Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
The testcases are generated so that the answer will be less than or equal to 2 * 109.

Example 1:
Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right

Example 2:
Input: obstacleGrid = [[0,1],[0,0]]
Output: 1

Constraints:
m == obstacleGrid.length
n == obstacleGrid[i].length
1 <= m, n <= 100
obstacleGrid[i][j] is 0 or 1.
 */

package dp.grids;

import java.util.Arrays;

public class UniquePath2 {
    public static int memoization(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) Arrays.fill(dp[i], -1);
        return memoizationHelper(matrix, row - 1, col - 1, dp);
    }

    public static int memoizationHelper(int[][] matrix, int r, int c, int[][] dp) {
        if (r < 0 || c < 0) return 0;
        if (matrix[r][c] == 1) return 0;
        if (r == 0 && c == 0) return 1;
        if (dp[r][c] != -1) return dp[r][c];
        int up = memoizationHelper(matrix, r - 1, c, dp);
        int left = memoizationHelper(matrix, r, c - 1, dp);
        dp[r][c] = up + left;
        return dp[r][c];
    }

    public static int tabulation(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        if (matrix[0][0] == 1) return 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                if (matrix[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

                int left = 0;
                int up = 0;
                if (j > 0) left = dp[i][j - 1];
                if (i > 0) up = dp[i - 1][j];
                dp[i][j] = left + up;
            }
        }
        return dp[row - 1][col - 1];
    }

    public static int tabulationSpaceOptimized(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (matrix[0][0] == 1) return 0;

        int[] prev = new int[col];

        for (int i = 0; i < row; i++) {
            int[] temp = new int[col];
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    prev[j] = 1;
                    temp[j] = 1;
                    continue;
                }
                if (matrix[i][j] == 1) {
                    prev[j] = 0;
                    temp[j] = 0;
                    continue;
                }

                int left = 0;
                int up = 0;
                if (j > 0) left = temp[j - 1];
                if (i > 0) up = prev[j];
                temp[j] = left + up;
            }
            prev = temp;
        }
        return prev[col - 1];
    }
}
