/*
Move Zero's to End

Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while
keeping the non-zero elements at the start of the array in their original order. Return the modified array.

Example :
Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
Output: [1, 2, 2, 3, 0, 0]
Explanation: Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.

Expected time complexity:
The expected time complexity is O(n).

Constraints:
1 ≤ n ≤ 10^6
0 ≤ arr[i] ≤ 10^9
Time limit: 1 sec
 */

package arrays.easy;

public class MovesZeroToEnd {
    public static int[] moveZeros(int []a) {
        int index=0, arrLength= a.length;
        for(int i=0; i<arrLength; i++){
            if(a[i]!=0){
                a[index] = a[i];
                index++;
            }
        }
        while(index<arrLength)
            a[index++] = 0;
        return a;
    }
}
