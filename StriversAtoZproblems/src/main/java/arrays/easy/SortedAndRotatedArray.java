/*
Check if Array Is Sorted and Rotated

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of
positions (including zero). Otherwise, return false. There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such that
A[i] == B[(i+x) % A.length], where % is the modulo operation.

Example:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

package arrays.easy;

public class SortedAndRotatedArray {
    public static boolean checkSortedAndRotatedArray(int[] a) {
        int count = 0, len=a.length;
        for(int i=0; i<len; i++){
            if(a[i]>a[(i+1)%len]) count++;
            if(count > 1) return false;
        }
        return true;
    }
}
