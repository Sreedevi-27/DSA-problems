/*
Linear Search

You are given an array ‘arr’ containing ‘n’ integers. You are also given an integer ‘num’, and your task is
to find whether ‘num’ is present in the array or not.

If ‘num’ is present in the array, return the 0-based index of the first occurrence of ‘num’. Else, return -1.

Example:
Input: ‘n’ = 5, ‘num’ = 4  'arr' =  [6,7,8,4,1]
Output: 3
Explanation:
4 is present at the 3rd index.

Expected time complexity:
The expected time complexity is O(n).

Constraints:
1  <= 'n' <= 10^6
1 <= 'arr'[i] <= 1000
Time Limit: 1 sec
 */

package arrays.easy;

public class LinearSearch {
    public static int linearSearch(int []arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num) return i;
        }
        return -1;
    }
}
