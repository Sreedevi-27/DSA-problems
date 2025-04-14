/*
House robber 2

A robber is targeting to rob houses from a street. Each house has security measures that alert the police when two
adjacent houses are robbed. The houses are arranged in a circular manner, thus the first and last houses are adjacent
to each other.

Given an integer array money, where money[i] represents the amount of money that can be looted from the (i+1)th house.
Return the maximum amount of money that the robber can loot without alerting the police.

Example 1:
Input: money = [2, 1, 4, 9]
Output: 10
Explanation: [2, 1, 4, 9] The underlined houses would give the maximum loot.
Note that we cannot loot the 1st and 4th houses together.

Example 2:
Input: money = [1, 5, 2, 1, 6]
Output: 11
Explanation: [1, 5, 2, 1, 6] The underlined houses would give the maximum loot.

Constraints:
1 <= money.length <= 105
0 <= money[i] <= 1000
 */

package dp.OneD;

import java.util.Arrays;

public class HouseRobber2 {
    public static int memoization(int[] nums){
        int len = nums.length;
        if(len==1) return nums[0];

        int[] nums1 = new int[len-1];
        int[] dp1 = new int[len-1];

        // As the first and last index cannot be adjacent, leave first index and find Ans, then leave last index and find Ans
        // Final result will the MAX of both

        Arrays.fill(dp1, -1);
        for(int i=0; i<nums1.length; i++) nums1[i] = nums[i];
        int cost1 = memoizationHelper(nums1, len-1, dp1, len-2);

        Arrays.fill(dp1, -1);
        for(int i=0; i<nums1.length; i++) nums1[i] = nums[i+1];
        int cost2 = memoizationHelper(nums1, len-1, dp1, len-2);

        return Math.max(cost1, cost2);
    }

    public static int memoizationHelper(int[] nums, int len, int[] dp, int index){
        if(index<0) return 0;
        if(index==0) return nums[0];
        if(dp[index] != -1) return dp[index];
        int take = nums[index] + memoizationHelper(nums, len, dp, index-2);
        int notTake =  memoizationHelper(nums, len, dp, index-1);
        dp[index] = Math.max(take, notTake);
        return dp[index];
    }

    public static int tabulation(int[] nums){
        int len = nums.length;
        if(len==1) return nums[0];

        int[] nums1 = new int[len-1];
        // As the first and last index cannot be adjacent, leave first index and find Ans, then leave last index and find Ans
        // Final result will the MAX of both
        for(int i=0; i<nums1.length; i++) nums1[i] = nums[i];
        int cost1 = tabulationHelper(nums1);

        for(int i=0; i<nums1.length; i++) nums1[i] = nums[i+1];
        int cost2 = tabulationHelper(nums1);

        return Math.max(cost1, cost2);
    }
    public static int tabulationHelper(int[] nums){
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i=1; i<len; i++){
            int take = nums[i];
            if(i>1) take = take + dp[i-2];
            int notTake = dp[i-1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[len-1];
    }

    public static int tabulationSpaceOptimised(int[] nums){
        int len = nums.length;
        if(len==1) return nums[0];

        int[] nums1 = new int[len-1];

        // As the first and last index cannot be adjacent, leave first index and find Ans, then leave last index and find Ans
        // Final result will the MAX of both
        for(int i=0; i<nums1.length; i++) nums1[i] = nums[i];
        int cost1 = tabulationSpaceOptimisedHelper(nums1);

        for(int i=0; i<nums1.length; i++) nums1[i] = nums[i+1];
        int cost2 = tabulationSpaceOptimisedHelper(nums1);

        return Math.max(cost1, cost2);
    }

    public static int tabulationSpaceOptimisedHelper(int[] nums){
        int len = nums.length;
        int prev = nums[0];
        int prev2 = 0, result=0;
        for(int i=1; i<len; i++){
            int take = nums[i]+ prev2;
            int notTake = prev;
            result = Math.max(take, notTake);
            prev2 = prev;
            prev = result;
        }
        return prev;
    }
}
