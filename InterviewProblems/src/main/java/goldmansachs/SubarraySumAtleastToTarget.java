/*
https://leetcode.com/problems/minimum-size-subarray-sum/description/
209. Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2;
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

Constraints:
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 */
package goldmansachs;

public class SubarraySumAtleastToTarget {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,6,11,2};
        int target = 12;
        System.out.println(findSubarraySumAtleastToTarget(arr, target));
    }

    public static int findSubarraySumAtleastToTarget(int[] arr, int target){
        int sum = 0;
        int start = 0, end = 0;
        int arrLength = arr.length;
        int minLength = Integer.MAX_VALUE;
        int bestStart = 0, bestEnd=0;
        while(end<arrLength){
            sum += arr[end];
            while(sum>=target){
                if(minLength>end-start+1){
                    minLength = end-start+1;
                    bestStart = start;
                    bestEnd = end;
                }
                sum -= arr[start];
                start++;
            }
            end++;
        }
        // If no sub array found, return 0;
        if(minLength==Integer.MAX_VALUE) return 0;

        // Extract and return the minimum subarray found
        int[] result = new int[bestEnd - bestStart + 1];
        System.arraycopy(arr, bestStart, result, 0, bestEnd - bestStart + 1);

        return minLength;
    }
}
