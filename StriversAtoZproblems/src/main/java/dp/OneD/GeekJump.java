/*
Geek Jump

Geek wants to climb from the 0th stair to the (n-1)th stair. At a time the Geek can climb either one or two steps.
A height[N] array is also given. Whenever the geek jumps from stair i to stair j, the energy consumed in the jump is
abs(height[i]- height[j]), where abs() means the absolute difference. return the minimum energy that can be used by the
Geek to jump from stair 0 to stair N-1.

Example:
Input: n = 4, height = {10 20 30 10}
Output: 20
Explanation:
Geek jump from 1st to 2nd stair(|20-10| = 10 energy lost). Then a jump from the 2nd to the last stair(|10-20| = 10 energy lost). So, total energy lost is 20 which is the minimum.

Your Task:
You don't need to read input or print anything. Your task is to complete the function MinimumEnergy() which takes the array height, and integer n, and returns the minimum energy that is lost.

Expected Time Complexity: O(n)
Expected Space Complexity: O(n)

Constraint:
1<=n<=100000
1<=height[i]<=1000
 */

package dp.OneD;

import java.util.Arrays;

public class GeekJump {
    public int memoization(int arr[],int N){
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return memoizationHelper(dp, arr, N-1);
    }

    public int memoizationHelper(int[] dp, int[] health, int n){
        if(n==0) return 0;
        if(dp[n]==-1){
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = memoizationHelper(dp, health, n-1) + Math.abs(health[n]-health[n-1]);
            if(n>1) jumpTwo = memoizationHelper(dp, health, n-2) + Math.abs(health[n]-health[n-2]);
            dp[n] = Math.min(jumpOne, jumpTwo);
        }
        return dp[n];
    }

    public int tabulation(int arr[],int N){
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for(int i=1; i<N; i++){
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
            if(i>1) jumpTwo = dp[i-2] + Math.abs(arr[i]-arr[i-2]);
            dp[i] = Math.min(jumpTwo, jumpOne);
        }
        return dp[N-1];
    }
}
