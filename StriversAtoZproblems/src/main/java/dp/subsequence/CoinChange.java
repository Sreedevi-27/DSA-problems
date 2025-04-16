/*
322. Coin Change

You are given an integer array coins representing coins of different denominations and an integer amount representing
a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by
any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.

Example 1:
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

Example 2:
Input: coins = [2], amount = 3
Output: -1

Example 3:
Input: coins = [1], amount = 0
Output: 0

Constraints:
1 <= coins.length <= 12
1 <= coins[i] <= 231 - 1
0 <= amount <= 104
 */

package dp.subsequence;

import java.util.Arrays;

public class CoinChange {
    public static int memoization(int[] coins, int target){
        int len = coins.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        int ans = memoizationHelper(coins, target, dp, len-1);
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }

    public static int memoizationHelper(int[] coins, int target, int[][] dp, int index){
        if(index==0){
            if(target%coins[0]==0) return target/coins[0];
            return (int)(Math.pow(10,9));
        }
        if(dp[index][target]!=-1) return dp[index][target];
        int notTake = memoizationHelper(coins, target, dp, index-1);
        int take = Integer.MAX_VALUE;
        if(target>=coins[index]) take = 1 + memoizationHelper(coins, target-coins[index], dp, index);
        dp[index][target] = Math.min(notTake, take);
        return dp[index][target];
    }

    public static int tabulation(int[] coins, int target){
        int len = coins.length;
        int[][] dp = new int[len][target+1];

        for(int i=0; i<=target; i++){
            if(i%coins[0]==0) dp[0][i] = i/coins[0];
            else  dp[0][i] = (int)(Math.pow(10,9));
        }

        for(int i=1; i<len; i++){
            for(int j=0; j<=target; j++){
                int notTake = dp[i-1][j];
                int take = Integer.MAX_VALUE;
                if(j>=coins[i]) take = 1 + dp[i][j-coins[i]];
                dp[i][j] = Math.min(notTake, take);
            }
        }
        if(dp[len-1][target] >= (int)(Math.pow(10,9))) return -1;
        return dp[len-1][target];
    }

    public static int tabulationSpaceOptimised(int[] coins, int target){
        int len = coins.length;
        int[] prev = new int[target+1];

        for(int i=0; i<=target; i++){
            if(i%coins[0]==0) prev[i] = i/coins[0];
            else  prev[i] = (int)(Math.pow(10,9));
        }

        for(int i=1; i<len; i++){
            int[] curr = new int[target+1];
            for(int j=0; j<=target; j++){
                int notTake = prev[j];
                int take = Integer.MAX_VALUE;
                if(j>=coins[i]) take = 1 + curr[j-coins[i]];
                curr[j] = Math.min(notTake, take);
            }
            prev = curr;
        }
        if(prev[target] >= (int)(Math.pow(10,9))) return -1;
        return prev[target];
    }
}
