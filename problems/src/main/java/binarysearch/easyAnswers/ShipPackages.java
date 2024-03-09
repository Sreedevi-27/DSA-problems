/*
Capacity To Ship Packages Within D Days

A conveyor belt has packages that must be shipped from one port to another within days days. The ith package on the conveyor
belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages
into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

Constraints:
1 <= days <= weights.length <= 5 * 104
1 <= weights[i] <= 500
 */

package binarysearch.easyAnswers;

public class ShipPackages {
    public static int shipWithinDays(int[] weights, int days) {
        int[] maxSum = findSumAndMax(weights);
        int left = maxSum[0], right = maxSum[1];
        int minimum = left;
        while(left <= right){
            int mid = left + (right-left)/2;
            int noOfDays = findNoOfDays(weights, mid);
            if(noOfDays>days) left = mid+1;
            else{
                minimum = Math.min(minimum, mid);
                right = mid-1;
            }
        }
        return left;
    }

    public static int[] findSumAndMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
            sum += arr[i];
        }
        return new int[]{max, sum};
    }

    public static int findNoOfDays(int[] nums, int mid){
        int count = 0, sum=0;
        for(int i=0; i<nums.length;i++){
            if(sum + nums[i] > mid){
                count++;
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
        }
        count++;
        return count;
    }
}
