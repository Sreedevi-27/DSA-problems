/*
Largest Element in the Array

Given an array ‘arr’ of size ‘n’ find the largest element in the array.

Example:
Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
Output: 5
Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.

Expected Time Complexity:
O(n), Where ‘n’ is the size of an input array ‘arr’.

Constraints :
1 <= 'n' <= 10^5
1 <= 'arr[i]' <= 10^9
Time Limit: 1 sec
 */

package arrays.easy;

public class LargestElement {
    static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr)
            max = Math.max(ele, max);
        return max;
    }
}
