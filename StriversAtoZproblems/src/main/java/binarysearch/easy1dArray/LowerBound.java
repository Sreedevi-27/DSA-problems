/*
Implement Lower Bound

You are given an array 'arr' sorted in non-decreasing order and a number 'x'. You must return the index of lower bound of 'x'.
Note:
For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' such that the value 'arr[idx]'
is not less than 'x' If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.
Consider 0-based indexing.

Example:
Input: ‘arr’ = [1, 2, 2, 3] and 'x' = 0
Output: 0
Explanation: Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.

Expected Time Complexity:
Try to do this in O(log(n)).

Constraints:
1 <= ‘n’ <= 10^5
0 <= ‘arr[i]’ <= 10^5
1 <= ‘x’ <= 10^5
 */

package binarysearch.easy1dArray;

public class LowerBound {
    public static int lowerBound(int []nums, int x) {
        int len = nums.length;
        int left=0, right=nums.length-1,ans=len;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]>=x){
                ans = mid;
                right = mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
}
