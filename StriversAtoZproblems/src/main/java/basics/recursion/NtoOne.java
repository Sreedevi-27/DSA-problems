/*
N to One Without loop

You are given an integer ‘n’.
Your task is to return an array containing integers from ‘n’ to ‘1’ (in decreasing order) without using loops.
Note:
In the output, you will see the array returned by you.

Example:
Input: ‘n’ = 5
Output: 5 4 3 2 1
Explanation: An array containing integers from ‘n’ to ‘1’ is [5, 4, 3, 2, 1].

Expected Time Complexity:
The expected time complexity is O(n), where 'n' is the given integer.
Expected Space Complexity:
The expected space complexity is O(n), where 'n' is the given integer.

Constraints:
1 <= n <= 10^4
Time Limit: 1-sec
 */

package basics.recursion;

public class NtoOne {
    public static int[] printNos(int x) {
        int arr[] = new int[x];
        return printElements(arr, x, 1);
    }

    public static int[] printElements(int[] arr, int x, int start){
        if(x==0)
            return arr;
        arr[x-1] = start;
        return printElements(arr, x-1, start+1);
    }
}
