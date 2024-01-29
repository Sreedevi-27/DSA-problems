/*
Reverse Pairs

Given an integer array nums, return the number of reverse pairs in the array. A reverse pair is a pair (i, j) where:
0 <= i < j < nums.length and
nums[i] > 2 * nums[j].

Example :
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

Constraints:
1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1
 */

package arrays.hard;

import java.util.ArrayList;

public class ReversePair {
    public static int reversePairs(int[] nums) {
        return splitArray(nums, 0, nums.length-1);
    }

    public static int splitArray(int[] nums, int start, int end){
        int count = 0;
        if(start>=end) return count;
        int mid = (start+end)/2;
        count += splitArray(nums, start, mid);
        count += splitArray(nums, mid+1, end);
        count += countPairs(nums, start, mid, end);
        mergeArray(nums, start, mid, end);
        return count;
    }

    public static int countPairs(int[] nums, int start, int mid, int end){
        int count=0, x=mid+1;
        for(int i=start; i<=mid;i++){
            while(x<=end && (long)nums[i]>(long)(2*(long)nums[x])) x++;
            count += x-(mid+1);
        }
        return count;
    }

    public static void mergeArray(int[] nums, int start, int mid, int end){
        int left = start, right = mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while(left<=mid && right<=end){
            if(nums[left] > nums[right]){
                list.add(nums[right]);
                right++;
            }else{
                list.add(nums[left]);
                left++;
            }
        }

        while(left<=mid){
            list.add(nums[left]);
            left++;
        }

        while(right<=end){
            list.add(nums[right]);
            right++;
        }

        for(int i=start; i<=end; i++){
            nums[i] = list.get(i-start);
        }
    }
}
