/*
Majority Element

Given an array nums of size n, return the majority element. The majority element is the element that appears
more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

Follow-up: Could you solve the problem in linear time and in O(1) space?
 */

package arrays.medium;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int ele = nums[0];
        for(int i=1; i<nums.length; i++){
            if(count == 0) ele = nums[i];
            if(nums[i]==ele) count++;
            else count--;
        }
        return ele;
    }
}
