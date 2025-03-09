/*
Implement Upper Bound

You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’. Implement the ‘upperBound’ function to
find the index of the upper bound of 'x' in the array.

Note:
The upper bound in a sorted array is the index of the first value that is greater than a given value.
If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
We are using 0-based indexing.
Try to write a solution that runs in log(n) time complexity.

Example:
Input : ‘arr’ = {2,4,6,7} and ‘x’ = 5,
Output: 2
Explanation: The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).

Expected Time Complexity:
Try to do this in O(log(n)).

Constraints:
1 <= ‘n’ <= 10^5
1 <= ‘x’ <= 10^9
1 <= ‘arr[i]’ <= 10^9
Time Limit: 1 sec
 */

package binarysearch.easy1dArray;

public class UpperBound {
    public static int upperBound(int []nums, int x){
        int left=0, right=nums.length-1,ans=nums.length;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]>x){
                ans = mid;
                right = mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
}
