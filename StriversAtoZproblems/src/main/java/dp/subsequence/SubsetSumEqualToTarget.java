/*
Subset sum equals to target

Given an array arr of n integers and an integer target, determine if there is a subset of the given array with a sum
equal to the given target.

Example 1:
Input: arr = [1, 2, 7, 3], target = 6
Output: True
Explanation: There is a subset (1, 2, 3) with sum 6.

Example 2:
Input: arr = [2, 3, 5], target = 6
Output: False
Explanation: There is no subset with sum 6.

Constraints:
1 <= n = 100
1<= arr[i] <= 100
1<= target <= 5*103
 */

package dp.subsequence;

import java.util.Arrays;

public class SubsetSumEqualToTarget {
    public static boolean memoization(int[] arr, int target){
        int len = arr.length;
        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        return memoizationHelper(arr, target, len-1, dp);
    }

    public static boolean memoizationHelper(int[] arr, int target, int index, int[][] dp){
        if(target==0) return true;
        if(index==0) return (target==arr[0]);
        if(dp[index][target]!=-1) return (dp[index][target]==1) ? true : false;

        boolean take = false;
        if(arr[index]<=target) take = memoizationHelper(arr, target-arr[index], index-1, dp);
        boolean notTake = memoizationHelper(arr, target, index-1, dp);
        dp[index][target] = (take || notTake) ? 1 : 0;
        return (take || notTake);
    }


    public static boolean tabulation(int[] arr, int target){
        int len = arr.length;
        boolean[][] dp = new boolean[len][target+1];
        for(int i=0; i<len; i++)  dp[i][0] = true;
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }

        for(int i=1; i<len; i++){
            for (int j=0; j<=target; j++){
                boolean notTake = dp[i-1][j];
                boolean take = false;
                if(arr[i]<=j) take = dp[i-1][j-arr[i]];
                dp[i][j] = (take || notTake);
            }
        }
        return dp[len-1][target];
    }

    public static boolean tabulationSpaceOptimized(int[] arr, int target){
        int len = arr.length;
        boolean[] prev = new boolean[target+1];
        prev[0] = true;
        if(arr[0]<=target) prev[arr[0]] = true;

        for(int i=1; i<len; i++){
            boolean[] curr = new boolean[target+1];
            for (int j=0; j<=target; j++){
                boolean notTake = prev[j];
                boolean take = false;
                if(arr[i]<=j) take = prev[j-arr[i]];
                curr[j] = (take || notTake);
            }
            prev=curr;
        }
        return prev[target];
    }
}
