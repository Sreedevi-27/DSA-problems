/*
1 to N Without Loop

You are given an integer ‘n’.
Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.

Example:
Input: ‘n’ = 5
Output: 1 2 3 4 5
Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].

Expected Time Complexity:
The expected time complexity is O(n), where 'n' is the given integer.

Constraints:
1 <= n <= 10^6
Time Limit: 1-sec
 */

package basics.recursion;

public class OneToN {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        return printElements(arr, x);
    }

    public static int[] printElements(int[] arr, int x){
        if(x==0){
            return arr;
        }
        arr[x-1] = x;
        return printElements(arr, x-1);
    }
}
