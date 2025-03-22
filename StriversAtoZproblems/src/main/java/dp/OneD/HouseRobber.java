/*
198. House Robber

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and
it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can
rob tonight without alerting the police.

Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 400
 */


package dp.OneD;

import java.util.Arrays;

public class HouseRobber {
    public static int memoization(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, -1);
        return memoizationHelper(nums, dp, len-1);
    }

    public static int memoizationHelper(int[] nums, int[] dp, int index){
        if(index<0) return 0;
        if(index==0) return nums[index];
        if(dp[index]!=-1) return dp[index];
        int pick = nums[index]+ memoizationHelper(nums, dp, index-2);
        int notPick = memoizationHelper(nums, dp, index-1);
        dp[index] = Math.max(pick, notPick);
        return dp[index];
    }

    public static int tabulation(int[] nums){
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i=1; i<len; i++){
            int notPick = dp[i-1];
            int pick = nums[i];
            if(i>=2) pick += dp[i-2];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[len-1];
    }

    public static int tabulationSpaceOptimised(int[] nums){
        // we can optimise the Tabulation solution from  O(N) to O(1) since, we need last 2 updated values for proceeding
        // with the next operation
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
