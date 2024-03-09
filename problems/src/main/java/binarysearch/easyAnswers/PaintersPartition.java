/*
Painter's Partition Problem

Given an array/list of length ‘n’, where the array/list represents the boards and each element of the given array/list
represents the length of each board. Some ‘k’ numbers of painters are available to paint these boards. Consider that
each unit of a board takes 1 unit of time to paint.
You are supposed to return the area of the minimum time to get this job done of painting all the ‘n’ boards under a
constraint that any painter will only paint the continuous sections of boards.

Example 1:
Input: arr = [2, 1, 5, 6, 2, 3], k = 2
Output: 11
Explanation:
First painter can paint boards 1 to 3 in 8 units of time and the second painter can paint boards 4-6 in 11 units of time.
Thus both painters will paint all the boards in max(8,11) = 11 units of time. It can be shown that all the boards can't be
painted in less than 11 units of time.

Constraints :
1 <= n <= 10^5
1 <= k <= n
1 <= arr[i] <= 10^9
Time Limit: 1 sec.
 */

package binarysearch.easyAnswers;

import java.util.ArrayList;

public class PaintersPartition {
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k){
        int left = boards.get(0), right = 0;
        for(int i=0; i<boards.size(); i++){
            right += boards.get(i);
            left = Math.max(left, boards.get(i));
        }

        while(left<=right){
            int mid = left+(right-left)/2;
            int count = findCount(boards, mid);
            if(count > k) left = mid+1;
            else right = mid-1;
        }
        return left;
    }

    public static int findCount(ArrayList<Integer> boards, int mid){
        int count=1, sum=0;
        for(int i=0; i<boards.size(); i++){
            int ele = boards.get(i);
            if(ele+sum > mid) {
                count++;
                sum = ele;
            }else sum += ele;
        }
        return count;
    }
}
