package dp.subsequence;

import java.util.Arrays;

public class TargetSum {
    // Same as CountSubSetsWithDiff sm
    public static int memoization(int[] arr, int diff){
        int len = arr.length;
        int sum=0;
        for(int a : arr) sum += a;

        if ((sum + diff) % 2 != 0) return 0;
        int target = (sum + diff) / 2;
        if (target < 0) return 0;

        int[][] dp = new int[len][target+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        return memoizationHelper(arr, target, len-1, dp);
    }

    public static int memoizationHelper(int[] arr, int target, int index, int[][] dp){
        if(index==0){
            if(target==0 && arr[0]==0) return 2; // take and notTake - each returns 1
            if(target==0 || target == arr[0]) return 1;
            return 0;
        }
        if(dp[index][target]!=-1) return dp[index][target];

        int take = 0;
        if(arr[index]<=target) take = memoizationHelper(arr, target-arr[index], index-1, dp);
        int notTake = memoizationHelper(arr, target, index-1, dp);
        dp[index][target] = (take + notTake);
        return dp[index][target];
    }

    public static int tabulation(int[] arr, int diff){
        int len = arr.length;
        int sum=0;
        for(int a : arr) sum += a;

        if ((sum + diff) % 2 != 0) return 0;
        int target = (sum + diff) / 2;
        if (target < 0) return 0;
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
                dp[i][j] = (take + notTake);
            }
        }
        return dp[len-1][target];
    }

    public static int tabulationSpaceOptimized(int[] arr, int diff){
        int len = arr.length;
        int sum=0;
        for(int a : arr) sum += a;

        if ((sum + diff) % 2 != 0) return 0;
        int target = (sum + diff) / 2;
        if (target < 0) return 0;

        int[] prev = new int[target+1];
        prev[0] = 1;
        if(arr[0]<=target) prev[arr[0]] = 1;

        for(int i=1; i<len; i++){
            int[] curr = new int[target+1];
            for (int j=0; j<=target; j++){
                int notTake = prev[j];
                int take = 0;
                if(arr[i]<=j) take = prev[j-arr[i]];
                curr[j] = (take + notTake);
            }
            prev=curr;
        }
        return prev[target];
    }
}
