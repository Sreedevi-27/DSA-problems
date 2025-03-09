/*
Find The Single Element

You are given a sorted array 'arr' of positive integers of size 'n'. It contains each number exactly twice except
for one number, which occurs exactly once. Find the number that occurs exactly once.

Example :
Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
Output: 2
Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2.

Expected time complexity :
The expected time complexity is O(n), but try solving it in O(log n).

Constraints:
1 <= 'n' <= 10^4
1 <= 'arr[i]' <= 10^9
‘n’ is always odd.
Time Limit: 1 sec
 */

package arrays.easy;

public class SingleElementInSortedArray {
    public static int getSingleElement(int []arr){
        for(int i=0; i<arr.length-1; i+=2){
            if(arr[i]!=arr[i+1]) return arr[i];
        }
        return arr[arr.length-1];
    }
}
