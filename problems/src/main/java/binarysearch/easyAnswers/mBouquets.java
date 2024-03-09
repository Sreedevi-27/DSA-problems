/*
Minimum Number of Days to Make m Bouquets

You are given an integer array bloomDay, an integer m and an integer k. You want to make m bouquets. To make a bouquet,
you need to use k adjacent flowers from the garden. The garden consists of n flowers, the ith flower will bloom in
the bloomDay[i] and then can be used in exactly one bouquet. Return the minimum number of days you need to wait to be
able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.

Example :
Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
We need 3 bouquets each should contain 1 flower.
After day 1: [x, _, _, _, _]   // we can only make one bouquet.
After day 2: [x, _, _, _, x]   // we can only make two bouquets.
After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.

Constraints:
bloomDay.length == n
1 <= n <= 105
1 <= bloomDay[i] <= 109
1 <= m <= 106
1 <= k <= n
 */

package binarysearch.easyAnswers;

public class mBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        int left = 1, right = findMax(bloomDay);
        int minimum = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right-left)/2;
            int count = findCount(bloomDay, mid, k);
            if(count<m){
                left = mid+1;
            }
            else{
                minimum = Math.min(minimum, mid);
                right = mid-1;
            }
        }
        if(minimum == Integer.MAX_VALUE) return -1;
        return minimum;
    }

    public static int findMax(int[] nums){
        int maximum = Integer.MIN_VALUE;
        for(int num : nums)
            maximum = Math.max(maximum, num);
        return maximum;
    }

    public static int findCount(int[] nums, int n, int k){
        int count = 0, var=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=n) var++;
            else var=0;
            if(var==k){
                var = 0;
                count++;
            }
        }
        return count;
    }
}
