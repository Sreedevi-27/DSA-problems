/*
Kth Missing Positive Number
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 */

package binarysearch.easyAnswers;

public class kthMissingNumber {
    public static int findKthPositive(int[] nums, int k) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            int missing = nums[mid]-(mid+1);
            if(missing < k) left = mid+1;
            else right=mid-1;
        }
        return right+k+1;
    }
}