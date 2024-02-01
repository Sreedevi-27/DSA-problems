/*
Find Minimum in Rotated Sorted Array

Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example,
the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example :
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Constraints:
n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
All the integers of nums are unique.
nums is sorted and rotated between 1 and n times.
 */

package binarysearch.easy1dArray;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int len=nums.length, min=Integer.MAX_VALUE;
        int left=0, right=len-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[left]<=nums[mid]){
                min = Math.min(nums[left], min);
                left=mid+1;
            }else{
                min = Math.min(nums[mid], min);
                right=mid-1;
            }
        }
        return min;
    }
}
