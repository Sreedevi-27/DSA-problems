/*
Subarray Sum Equals K

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example:
Input: nums = [1,1,1], k = 2
Output: 2

Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
 */

package arrays.medium;

import java.util.HashMap;

public class SubarrayEqualToSum {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0, count=0;
        hashMap.put(0, 1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int rem = sum-k;
            if(hashMap.containsKey(rem)){
                count+=hashMap.get(rem);
            }

            if(hashMap.containsKey(sum))
                hashMap.put(sum, hashMap.get(sum)+1);
            else
                hashMap.put(sum, 1);
        }
        return count;
    }
}
