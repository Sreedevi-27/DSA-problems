/*
Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number
in the range that is missing from the array.

Example :
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the
range since it does not appear in nums.

Constraints:
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 */

package arrays.easy;

public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int len = nums.length, sum=0;
        int total = (len*(len+1))/2;
        System.out.println(total);
        for(int i=0; i<len; i++)
            sum += nums[i];
        return total-sum;
    }
}
