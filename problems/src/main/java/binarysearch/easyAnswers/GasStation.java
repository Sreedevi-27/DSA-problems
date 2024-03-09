/*
Minimize Max Distance to Gas Station

You are given a sorted array ‘arr’ of length ‘n’, which contains positive integer positions of ‘n’ gas stations on the X-axis.
You are also given an integer ‘k’. You have to place 'k' new gas stations on the X-axis. You can place them anywhere on
the non-negative side of the X-axis, even on non-integer positions. Let 'dist' be the maximum value of the distance between
adjacent gas stations after adding 'k' new gas stations. Find the minimum value of dist.

Example 1:
Input: ‘n' = 5 , ‘k’=4, ‘arr’ = {1,2,3,4,5}.
Answer: 0.5
Explanation:
We can place 6 gas stations at 1.5, 2.5, 3.5, 4.5. Thus the maximum difference between adjacent gas stations is 0.5.
It can be shown that there is no possible way to add 4 gas stations in such a way that the value of ‘dist’ is lower than this.

Constraints:
2 <= n <= 10^5
1 <= k <= 10^6
1 <= arr[i] <= 10^9
Time Limit: 1 sec
 */

package binarysearch.easyAnswers;

public class GasStation {
    public static double minimiseMaxDistance(int []arr, int k){
        double left = 0, right = 0, len = arr.length;
        for(int i=0; i<len-1; i++){
            right = Math.max(right, (double)(arr[i+1]-arr[i]));
        }

        double diff = 1e-6;
        while(right-left > diff){
            double mid = left+(right-left)/(2.0);
            double count = findCount(arr, mid);
            if(count > k) left=mid;
            else right=mid;
        }
        return right;
    }

    public static double findCount(int[] arr, double mid){
        int count=0;
        for(int i=1; i<arr.length; i++){
            int diff = (int)((arr[i]-arr[i-1])/mid);
            if((arr[i]-arr[i-1]) == (diff)*mid) diff--;
            count += diff;
        }
        return count;
    }
}
