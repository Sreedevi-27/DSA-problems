/*
Split Array Largest Sum

Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split. A subarray is a contiguous part of the array.

Example 1:
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

Constraints:
1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= k <= min(50, nums.length)
*/

package binarysearch.easyAnswers;

public class SplitArray {
    public static int splitArray(int[] nums, int k) {
        int left = nums[0], right = 0;
        for(int ele : nums){
            left = Math.max(left, ele);
            right += ele;
        }

        while(left <= right){
            int mid = left + (right-left)/2;
            int count = findCount(nums, mid);
            if(count > k) left = mid+1;
            else right = mid-1;
        }
        return left;
    }

    public static int findCount(int[] nums, int mid){
        int count=1, sum=0;
        for(int ele : nums){
            if(sum+ele > mid){
                count++;
                sum=ele;
            }
            else sum += ele;
        }
        return count;
    }
}
