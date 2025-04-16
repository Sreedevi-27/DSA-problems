/*
0 and 1 Knapsack

Given two integer arrays, val and wt, each of size N, which represent the values and weights of N items respectively,
and an integer W representing the maximum capacity of a knapsack, determine the maximum value achievable by selecting
a subset of the items such that the total weight of the selected items does not exceed the knapsack capacity W.

Each item can either be picked in its entirety or not picked at all (0-1 property). The goal is to maximize the sum of
the values of the selected items while keeping the total weight within the knapsack's capacity.

Example 1:
Input: val = [60, 100, 120], wt = [10, 20, 30], W = 50
Output: 220
Explanation: Select items with weights 20 and 30 for a total value of 100 + 120 = 220.

Example 2:
Input: val = [10, 40, 30, 50], wt = [5, 4, 6, 3], W = 10
Output: 90
Explanation: Select items with weights 4 and 3 for a total value of 40 + 50 = 90.

Example 3:
Input: val = [20, 5, 10, 40, 15, 25], wt = [1, 2, 3, 8, 7, 4], W = 10
Output: 60

Constraints:
1 ≤ N ≤ 500
1 ≤ W ≤ 1000
1 ≤ wt[i] ≤ 500
1 ≤ val[i] ≤ 500
 */

package dp.subsequence;

import java.util.Arrays;

public class Knapsack01 {
    public static int memoization(int[] val, int[] wt, int target){
        int len = val.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        return memoizationHelper(val, wt, target, len-1, dp);
    }

    public static int memoizationHelper(int[] val, int[] wt, int target, int index, int[][] dp){
        if(index==0){
            if(wt[0] <= target) return val[0];
            return 0;
        }
        if(dp[index][target]!=-1) return dp[index][target];
        int notTake = memoizationHelper(val, wt, target, index-1, dp);
        int take = 0;
        if(wt[index]<=target) take = val[index] + memoizationHelper(val, wt, target-wt[index], index-1, dp);
        dp[index][target] = Math.max(take , notTake);
        return dp[index][target];
    }


    public static int tabulation(int[] val, int[] wt, int target){
        int len = val.length;
        int[][] dp = new int[len][target+1];

        for(int i=0; i<=target; i++){
            if(wt[0] <= i) dp[0][i] = val[0];
        }

        for(int i=1; i<len; i++){
            for(int j=0; j<=target; j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if(wt[i]<=j) take = val[i] +  dp[i-1][j-wt[i]];
                dp[i][j] = Math.max(take , notTake);
            }
        }
        return dp[len-1][target];
    }

    public static int tabulationSpaceOptimised(int[] val, int[] wt, int target){
        int len = val.length;
        int[] prev = new int[target+1];
        for(int i=0; i<=target; i++){
            if(wt[0] <= i) prev[i] = val[0];
        }

        for(int i=1; i<len; i++){
            int[] curr = new int[target+1];
            for(int j=0; j<=target; j++){
                int notTake = prev[j];
                int take = 0;
                if(wt[i]<=j) take = val[i] +  prev[j-wt[i]];
                curr[j] = Math.max(take , notTake);
            }
            prev = curr;
        }
        return prev[target];
    }
}
