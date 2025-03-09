package dp.OneD;

import java.util.Arrays;

public class GameJump2 {
    public int tabulation(int k, int arr[]) {
        int len = arr.length;
        int[] dp = new int[len];
        dp[0]=0;
        for(int i=1; i<len; i++){
            int min = Integer.MAX_VALUE;
            for(int j=1; j<=k; j++){
                if(i-j>=0){
                    int temp = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    min = Math.min(min, temp);
                }
            }
            dp[i] = min;
        }
        return dp[len-1];
    }

    public int minimizeCost(int k, int arr[]) {
        int len = arr.length;
        int[] dp = new int[len];
        Arrays.fill(dp,-1);
        return helper(arr, k, dp, len-1);
    }

    public int helper(int[] arr, int k, int[] dp, int i){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];

        int min = Integer.MAX_VALUE;
        for(int j=1; j<=k; j++){
            if(i-j>=0){
                int temp = helper(arr,k,dp,i-j) + Math.abs(arr[i]-arr[i-j]);
                min = Math.min(min, temp);
            }
        }
        dp[i] = min;
        return dp[i];
    }
}
