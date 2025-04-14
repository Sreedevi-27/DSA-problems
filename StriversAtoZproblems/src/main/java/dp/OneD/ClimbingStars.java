/*
70. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:
1 <= n <= 45
 */

package dp.OneD;

import java.util.Arrays;

public class ClimbingStars {

    public static int recursion(int n){
        return recursionHelper(n, n);
    }

    public static int recursionHelper(int n, int index){
        if(index==0) return 1;
        if(index<0) return 0;
        int one = recursionHelper(n, index-1);
        int two = recursionHelper(n, index-2);
        return one+two;
    }


    public static int memoization(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return memoizationHelper(n, dp);
    }

    public static int memoizationHelper(int n, int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int one = memoizationHelper(n-1, dp);
        int two = memoizationHelper(n-2, dp);
        dp[n] = one+two;
        return dp[n];
    }

    public static int tabulation(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public int tabulationSpaceOptimized(int n){
        int prev1 = 1;
        int prev2 = 1;
        int result = 0;
        for(int i=2; i<=n; i++){
            result = prev1+prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return prev2;
    }
}
