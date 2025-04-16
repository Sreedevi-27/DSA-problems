/*
Partition a set into two subsets with minimum absolute sum difference

Given an array arr of n integers, partition the array into two subsets such that the absolute difference
between their sums is minimized.

Example 1:
Input: arr = [1, 7, 14, 5]
Output: 1
Explanation: The array can be partitioned as [1, 7, 5] and [14], with an absolute difference of 1.

Example 2:
Input: arr = [3, 1, 6, 2, 2]
Output: 0
Explanation: The array can be partitioned as [3, 2, 2] and [6, 1], with an absolute difference of 0.

Constraints:
1 ≤ n * sum of array elements ≤ 106
0 < arr[i] <= 104
 */

package dp.subsequence;

public class PartitionArrayMinDifference {
    public static int minDifference(int[] arr){
        int len = arr.length;
        int sum = 0;
        for(int a : arr) sum += a;
        boolean[][] dp = new boolean[len][sum+1];
        for(int i=0; i<len; i++)  dp[i][0] = true;
        if (arr[0] <= sum) {
            dp[0][arr[0]] = true;
        }

        for(int i=1; i<len; i++){
            for (int j=0; j<=sum; j++){
                boolean notTake = dp[i-1][j];
                boolean take = false;
                if(arr[i]<=j) take = dp[i-1][j-arr[i]];
                dp[i][j] = (take || notTake);
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i=0; i<=sum; i++){
            if(!dp[len - 1][i]) continue;
            int s1 = i;
            int s2 = sum-s1;
            result = Math.min(result, Math.abs(s1-s2));
        }
        return result;
    }

}
