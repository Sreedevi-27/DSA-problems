/*
Reverse an Array

Given an array 'arr' of size 'n'. Return an array with all the elements placed in reverse order.
Note:
You don’t need to print anything. Just implement the given function.

Example:
Input: n = 6, arr = [5, 7, 8, 1, 6, 3]
Output: [3, 6, 1, 8, 7, 5]
Explanation: After reversing the array, it looks like this [3, 6, 1, 8, 7, 5].

Expected time complexity
The expected time complexity is O(n).

Constraints:
1 <= 'n' <= 10^6
-10^9 <= 'arr[i]' <=10^9
 */

package basics.recursion;

public class ReverseRecusrion {
    public static int[] reverseArray(int n, int []nums) {
        int rev[] = new int[nums.length];
        return reverse(n, nums, rev, 0);
    }

    public static int[] reverse(int n, int arr[], int rev[], int start){
        if(n==0)
            return rev;
        rev[start] = arr[n-1];
        return reverse(n-1, arr, rev, start+1);
    }
}
