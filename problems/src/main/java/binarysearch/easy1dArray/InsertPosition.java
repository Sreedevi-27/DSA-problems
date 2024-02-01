/*
Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return
the index where it would be if it were inserted in order. You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2


 */
package binarysearch.easy1dArray;

public class InsertPosition {
    public static int searchInsert(int[] arr, int target) {
        int len = arr.length;
        int left =0, right = len-1, ans=len;

        while(left <= right){
            int mid = (left) + (right-left)/2;
            if(arr[mid]>=target){
                ans = mid;
                right = mid-1;
            }
            else left = mid+1;
        }
        return ans;
    }
}
