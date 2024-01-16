/*
Longest Subarray With Sum K.

Ninja and his friend are playing a game of subarrays. They have an array ‘NUMS’ of length ‘N’. Ninja’s friend gives him
an arbitrary integer ‘K’ and asks him to find the length of the longest subarray in which the sum of elements is equal to ‘K’.
Ninjas asks for your help to win this game. Find the length of the longest subarray in which the sum of elements is equal to ‘K’.
If there is no subarray whose sum is ‘K’ then you should return 0.

Example:
Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]
Output: 4
There are two subarrays with sum = 4, [1, 2, 1] and [2, 1, 0, 1]. Hence the length of the longest subarray with sum = 4 is 4.

Constraints :
1 <= T <= 10
1 <= N <= 10^5
-10^6 <= NUMS[ i ] <= 10^6
-10^6 <= K <= 10^6
Sum of N Over all the Test cases <= 10^5
Time Limit: 1 sec
 */

package arrays.easy;

import java.util.HashMap;

public class LongestSubArray {
    public static int withOnlyPositiveElementsInArray(int[] nums, long k) {
        int sum=0, max=0;
        int j=0,i=0;
        while(i<nums.length){
            sum += nums[i];
            while(sum > k){
                sum = sum-nums[j];
                j++;
            }

            if(sum==k)
                max = Math.max(max, i-j+1);
            i++;
        }
        return max;
    }

    public static int withPositiveNegativeElementsInArray(int []nums, int k) {
        long sum=0;
        int max=0;
        HashMap<Long, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum==k){
                max = Math.max(max, i+1);
            }

            long n = sum - k;
            if(hashMap.containsKey(n)){
                max = Math.max(max, i-hashMap.get(n));
            }

            if(!hashMap.containsKey(sum)) hashMap.put(sum, i);
        }
        return max;
    }
}
