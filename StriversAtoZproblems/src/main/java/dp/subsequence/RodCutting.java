/*
Rod cutting problem

Given a rod of length N inches and an array price[] where price[i] denotes the value of a piece of rod of length
i inches (1-based indexing). Determine the maximum value obtainable by cutting up the rod and selling the pieces.
Make any number of cuts, or none at all, and sell the resulting pieces.

Example 1:
Input: price = [1, 6, 8, 9, 10, 19, 7, 20], N = 8
Output: 25
Explanation: Cut the rod into lengths of 2 and 6 for a total price of 6 + 19= 25.

Example 2:
Input: price = [1, 5, 8, 9], N = 4
Output: 10
Explanation: Cut the rod into lengths of 2 and 2 for a total price of 5 + 5 = 10.

Constraints:
1 ≤ N ≤ 1000
1 ≤ price[i] ≤ 105
 */
package dp.subsequence;

import java.util.Arrays;

public class RodCutting {
    public static int memoization(int[] price, int target){
        int len = price.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        return memoizationHelper(price, target, dp, len-1);
    }

    public static int memoizationHelper(int[] price, int target, int[][] dp, int index){
        if(index==0) return target*price[0];
        if(dp[index][target]!=-1) return dp[index][target];
        int notTake = memoizationHelper(price, target, dp, index-1);
        int take = 0;
        int rodLength = index+1;
        if(rodLength<=target) take = price[index] + memoizationHelper(price, target-rodLength, dp, index);
        dp[index][target] = Math.max(take, notTake);
        return dp[index][target];
    }

    public static int tabulation(int[] price, int target){
        int len = price.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<=target; i++) dp[0][i] = i*price[0];

        for(int i=1; i<len; i++){
            for(int j=0; j<=target; j++){
                int notTake = dp[i-1][j];
                int take = 0;
                int rodLength = i+1;
                if(rodLength<=j) take = price[i] + dp[i][j-rodLength];
                dp[i][j] = Math.max(notTake, take);
            }
        }
        return dp[len-1][target];
    }

    public static int tabulationSpaceOptimised(int[] price, int target){
        int len = price.length;
        int[] prev = new int[target+1];
        for(int i=0; i<=target; i++) prev[i] = i*price[0];

        for(int i=1; i<len; i++){
            int[] curr = new int[target+1];
            for(int j=0; j<=target; j++){
                int notTake = prev[j];
                int take = 0;
                int rodLength = i+1;
                if(rodLength<=j) take = price[i] + curr[j-rodLength];
                curr[j] = Math.max(notTake, take);
            }
            prev = curr;
        }
        return prev[target];
    }
}
