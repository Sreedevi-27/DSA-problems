package goldmansachs;

import java.util.Arrays;

public class KnapsackProblem {
    public static void main(String[] args) {
        int[] weights = new int[]{4, 5, 1};
        int[] values = new int[]{1, 2, 3};
        int capacity = 4;
        System.out.println(recSolution(weights, values, capacity, weights.length-1));

        int[][] dp = new int[weights.length][capacity+1];
        for(int i=0; i<weights.length; i++) Arrays.fill(dp[i],-1);
        System.out.println(memoizationSolution(weights, values, capacity, weights.length-1, dp));
    }

    public static int recSolution(int[] weight, int[] value, int W, int index){
        if(index==0){
            if(weight[index]<=W) return value[index];
            return 0;
        }
        int notTake = recSolution(weight, value, W, index-1);
        int take = Integer.MIN_VALUE;
        if(weight[index]<=W) take = value[index]+recSolution(weight, value, W-weight[index], index-1);
        return Math.max(take, notTake);
    }

        public static int memoizationSolution(int[] weight, int[] value, int W, int index, int[][] dp){
        if(index==0){
            if(weight[index]<=W) return value[index];
            return 0;
        }
        if(dp[index][W] != -1) return dp[index][W];
        int notTake = memoizationSolution(weight, value, W, index-1, dp);
        int take = Integer.MIN_VALUE;
        if(weight[index]<=W) take = value[index]+memoizationSolution(weight, value, W-weight[index], index-1, dp);
        dp[index][W] = Math.max(take, notTake);
        return dp[index][W];
    }
}
