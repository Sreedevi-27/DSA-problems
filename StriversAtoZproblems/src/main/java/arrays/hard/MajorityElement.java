/*
Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 3:
Input: nums = [1,2]
Output: [1,2]

Constraints:
1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */

package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && ele2 != nums[i]) {
                count1 = 1;
                ele1 = nums[i];
            } else if (count2 == 0 && ele1 != nums[i]) {
                count2 = 1;
                ele2 = nums[i];
            } else if (nums[i] == ele1) count1++;
            else if (nums[i] == ele2) count2++;
            else {
                count2--;
                count1--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (i == ele1) count1++;
            if (i == ele2) count2++;
        }

        int min = (nums.length / 3) + 1;
        if (count1 >= min) list.add(ele1);
        if (count2 >= min) list.add(ele2);

        return list;
    }
}
