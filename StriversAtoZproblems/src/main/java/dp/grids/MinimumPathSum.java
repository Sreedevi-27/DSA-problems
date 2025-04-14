/*
64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the
sum of all numbers along its path.
Note: You can only move either down or right at any point in time.

Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

Example 2:
Input: grid = [[1,2,3],[4,5,6]]
Output: 12

Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 200
0 <= grid[i][j] <= 200
 */

package dp.grids;

import java.util.Arrays;

public class MinimumPathSum {
    public int memoization(int[][] grid){
        int r = grid.length;
        int c = grid[0].length;
        int[][] dp = new int[r][c];
        for(int arr[] : dp){
            Arrays.fill(arr, -1);
        }
        return memoizationHelper(grid, dp, r-1, c-1);
    }

    public int memoizationHelper(int[][] grid, int[][] dp, int r, int c){
        if(r<0 || c<0) return (int)(Math.pow(10, 9));
        if(r==0 && c==0) return grid[0][0];
        if(dp[r][c]!=-1) return dp[r][c];
        int up = grid[r][c] + memoizationHelper(grid, dp, r-1, c);
        int left = grid[r][c] + memoizationHelper(grid, dp, r, c-1);
        dp[r][c] = Math.min(up, left);
        return dp[r][c];
    }


    public int tabulation(int[][] grid){
        int r = grid.length;
        int c = grid[0].length;
        int[][] dp = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i==0 && j==0){
                    dp[i][j] = grid[0][0];
                    continue;
                }
                int down = (int)(Math.pow(10, 9));
                int right = (int)(Math.pow(10, 9));
                if(i>0) down = grid[i][j] + dp[i-1][j];
                if(j>0) right = grid[i][j] + dp[i][j-1];
                dp[i][j] = Math.min(down, right);
            }
        }
        return dp[r-1][c-1];
    }

    public int tabulationSpaceOptimized(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int[] prevRow = new int[col];

        for(int i=0; i<row; i++){
            int[] temp = new int[col];
            for(int j=0; j<col; j++){
                if(i==0 && j==0){
                    prevRow[0] = grid[0][0];
                    temp[0] = grid[0][0];
                    continue;
                }
                int down = (int)(Math.pow(10, 9));
                int right = (int)(Math.pow(10, 9));
                if(i>0) down = grid[i][j] + prevRow[j];
                if(j>0) right = grid[i][j] + temp[j-1];
                temp[j] = Math.min(down, right);
            }
            prevRow = temp;
        }
        return prevRow[col-1];
    }
}
