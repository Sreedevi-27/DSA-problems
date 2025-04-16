/*
Count subsets with sum K

Given an array arr of n integers and an integer K, count the number of subsets of the given array that have a sum
equal to K. Return the result modulo 109+7.

Example 1:
Input: arr = [2, 3, 5, 16, 8, 10], K = 10
Output: 3
Explanation: The subsets are [2, 8], [10], and [2, 3, 5].

Example 2:
Input: arr = [1, 2, 3, 4, 5], K = 5
Output: 3
Explanation: The subsets are [5], [2, 3], and [1, 4].

Constraints:
 1 <= n <= 100
1 <= arr[i] <= 103
1 <= K <= 103
 */

package dp.subsequence;

import java.util.Arrays;

public class CountSubsetsWithTarget {
    public static final int MOD = 1000000007;

    public static int memoization(int[] arr, int target){
        int len = arr.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        return memoizationHelper(arr, target, len-1, dp);
    }

    public static int memoizationHelper(int[] arr, int target, int index, int[][] dp){
        if(target==0) return 1;
        if(index==0) return (target==arr[0]) ? 1 : 0;
        if(dp[index][target]!=-1) return dp[index][target];

        int take = 0;
        if(arr[index]<=target) take = memoizationHelper(arr, target-arr[index], index-1, dp);
        int notTake = memoizationHelper(arr, target, index-1, dp);
        dp[index][target] = (take + notTake) % MOD;
        return dp[index][target];
    }

    public static int tabulation(int[] arr, int target){
        int len = arr.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++)  dp[i][0] = 1;
        if (arr[0] <= target) {
            dp[0][arr[0]] = 1;
        }

        for(int i=1; i<len; i++){
            for (int j=0; j<=target; j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if(arr[i]<=j) take = dp[i-1][j-arr[i]];
                dp[i][j] = (take + notTake) % MOD;
            }
        }
        return dp[len-1][target];
    }

    public static int tabulationSpaceOptimized(int[] arr, int target){
        int len = arr.length;
        int[] prev = new int[target+1];
        prev[0] = 1;
        if(arr[0]<=target) prev[arr[0]] = 1;

        for(int i=1; i<len; i++){
            int[] curr = new int[target+1];
            for (int j=0; j<=target; j++){
                int notTake = prev[j];
                int take = 0;
                if(arr[i]<=j) take = prev[j-arr[i]];
                curr[j] = (take + notTake) % MOD;
            }
            prev=curr;
        }
        return prev[target];
    }
}
