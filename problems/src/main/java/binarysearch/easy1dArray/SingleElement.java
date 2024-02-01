/*
Single Element in a Sorted Array

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one
element which appears exactly once. Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example :
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Constraints:
1 <= nums.length <= 105
0 <= nums[i] <= 105
 */

package binarysearch.easy1dArray;

public class SingleElement {
    public static int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        if(nums[len-1]!=nums[len-2]) return nums[len-1];
        else if(nums[0]!=nums[1]) return nums[0];

        int left = 1, right=len-2;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            if(mid%2==0){
                if(nums[mid]!=nums[mid+1]) right=mid-1;
                else left=mid+1;
            }else{
                if(nums[mid]!=nums[mid+1]) left=mid+1;
                else right=mid-1;
            }
        }
        return -1;
    }
}
