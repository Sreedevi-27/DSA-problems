/*
Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.

Example :
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */

package binarysearch.easy1dArray;

public class FindPosition {
    public static int[] searchRange(int[] arr, int target) {
        int len = arr.length;
        int left=0, right = len-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                int x = mid;
                while(x!=0 && arr[x]==arr[x-1]) x--;
                while(mid!=len-1 && arr[mid]==arr[mid+1]) mid++;
                return new int[]{x, mid};

            } else if(arr[mid]>target) right = mid-1;
            else left = mid+1;
        }
        return new int[]{-1, -1};
    }
}
