/*
Find Single Element

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */

package arrays.easy;

import java.util.HashSet;

public class SingleElementInUnsortedArray {
    public static int singleNumber(int[] nums) {
        int numsLength = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        for(int i=0; i<numsLength; i++){
            if(hs.contains(nums[i]))
                sum -= nums[i];
            else{
                hs.add(nums[i]);
                sum += nums[i];
            }
        }
        return sum;
    }
}
