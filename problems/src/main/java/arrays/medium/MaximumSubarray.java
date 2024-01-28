/*
Maximum Subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104

Follow up:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

package arrays.medium;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curr = nums[0];
        for(int i=1; i<nums.length; i++){
            curr = Math.max(curr+nums[i], nums[i]);
            maxSum = Math.max(maxSum, curr);
        }
        return maxSum;
    }
}
