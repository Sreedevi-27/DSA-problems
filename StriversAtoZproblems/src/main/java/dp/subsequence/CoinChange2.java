/*
518. Coin Change II

ou are given an integer array coins representing coins of different denominations and an integer amount representing
a total amount of money.
Return the number of combinations that make up that amount. If that amount of money cannot be made up by any
combination of the coins, return 0.
You may assume that you have an infinite number of each kind of coin.
The answer is guaranteed to fit into a signed 32-bit integer.

Example 1:
Input: amount = 5, coins = [1,2,5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1

Example 2:
Input: amount = 3, coins = [2]
Output: 0
Explanation: the amount of 3 cannot be made up just with coins of 2.

Example 3:
Input: amount = 10, coins = [10]
Output: 1

Constraints:
1 <= coins.length <= 300
1 <= coins[i] <= 5000
All the values of coins are unique.
0 <= amount <= 5000
 */

package dp.subsequence;

import java.util.Arrays;

public class CoinChange2 {
    public static int memoization(int[] arr, int target){
        int len = arr.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        return memoizationHelper(arr, target, len-1, dp);
    }

    public static int memoizationHelper(int[] arr, int target, int index, int[][] dp){
        if(index==0){
            if(target%arr[0]==0) return 1;
            return 0;
        }
        if(dp[index][target]!=-1) return dp[index][target];
        int notTake = memoizationHelper(arr, target, index-1, dp);
        int take = 0;
        if(arr[index]<=target) take = memoizationHelper(arr, target-arr[index], index, dp);
        dp[index][target] = (take + notTake);
        return dp[index][target];
    }

    public static int tabulation(int[] arr, int target){
        int len = arr.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<=target; i++){
            if(i%arr[0]==0) dp[0][i] = 1;
        }

        for(int i=1; i<len; i++){
            for (int j=0; j<=target; j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if(arr[i]<=j) take = dp[i][j-arr[i]];
                dp[i][j] = (take + notTake);
            }
        }
        return dp[len-1][target];
    }

    public static int tabulationSpaceOptimized(int[] arr, int target){
        int len = arr.length;
        int[] prev = new int[target+1];
        for(int i=0; i<=target; i++){
            if(i%arr[0]==0) prev[i] = 1;
        }

        for(int i=1; i<len; i++){
            int[] curr = new int[target+1];
            for (int j=0; j<=target; j++){
                int notTake = prev[j];
                int take = 0;
                if(arr[i]<=j) take = curr[j-arr[i]];
                curr[j] = (take + notTake);
            }
            prev=curr;
        }
        return prev[target];
    }
}
