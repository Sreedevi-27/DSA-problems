/*
Introduction to DP

Geek is learning data structures, and he recently learned about the top-down and bottom-up dynamic programming approaches.
Geek is having trouble telling them apart from one another.
When given an integer n, where n is based on a 0-based index, find the nth Fibonacci number.
Every ith number in the series equals the sum of the (i-1)th and (i-2)th numbers, where the first and second numbers are
specified as 0 and 1, respectively.
For the given issue, code both top-down and bottom-up approaches.
Note : As the answer might be large, return the final answer modulo 109 + 7

Example 1:
Input:
n = 5
Output: 5
Explanation: 0,1,1,2,3,5 as we can see 5th number is 5.

Example 2:
Input:
n = 6
Output: 8
Explanation: 0,1,1,2,3,5,8 as we can see 6th number is 8.

Constraints:
1 <= n <= 104

Your Task:
You don't need to read input or print anything. Your task is to complete two functions topDown() and bottomUp() which take n as input parameters and return the nth Fibonacci number.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
 */

package dp.introduction;

import java.util.Arrays;

public class Fibonacci {
    static int mod = (int)1e9 + 7;

    // Memoization
    static long topDown(int n) {
        long[] arr = new long[n+1];
        Arrays.fill(arr, -1);
        return topDownHelper(n, arr);
    }

    static long topDownHelper(int n, long[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n]%mod;
        return dp[n] = ((long)(topDownHelper(n-1, dp))+ (long)(topDownHelper(n-2, dp))) % mod;
    }


    // Tabulation
    static long bottomUp(int n) {
        if(n<=1) return n;
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i]=(dp[i-1]+dp[i-2])%mod;
        }
        return dp[n];
    }
}
