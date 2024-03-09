/*
Aggressive Cows

You are given an array 'arr' consisting of 'n' integers which denote the position of a stall. You are also given an
integer 'k' which denotes the number of aggressive cows.You are given the task of assigning stalls to 'k' cows such that
the minimum distance between any two of them is the maximum possible. Print the maximum possible minimum distance.

Example 1:
Input: 'n' = 3, 'k' = 2 and 'arr' = {1, 2, 3}
Output: 2
Explanation: The maximum possible minimum distance will be 2 when 2 cows are placed at positions {1, 3}. Here distance between cows is 2.

Constraints :
2 <= 'n' <= 10 ^ 5
2 <= 'k' <= n
0 <= 'arr[i]' <= 10 ^ 9
Time Limit: 1 sec.
 */

package binarysearch.easyAnswers;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int len = stalls.length;
        int left = 0, right = stalls[len-1]-stalls[0];
        while(left <= right){
            int mid=left+(right-left)/2;
            boolean isCountSatisfies = findCount(stalls, k, mid);
            if(isCountSatisfies)
                left=mid+1;
            else
                right=mid-1;
        }
        return right;
    }

    public static boolean findCount(int []stalls, int k, int max) {
        int count=1, j=0;
        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-stalls[j] >= max){
                count++;
                j = i;
            }
            if(count==k) return true;
        }
        return false;
    }
}
