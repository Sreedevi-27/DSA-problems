/*
Print Fibonacci Series

Given an integer ‘n’, return first n Fibonacci numbers using a generator function.

Example:
Input: ‘n’ = 5
Output: 0 1 1 2 3
Explanation: First 5 Fibonacci numbers are: 0, 1, 1, 2, and 3.

Expected time complexity
The expected time complexity is O(n).

Constraints:
1 <= n <= 45
Time Limit: 1 s
 */

package basics.recursion;

public class FibonacciRecursion {
    public static int[] generateFibonacciNumbers(int n) {
        int[] fibb = new int[n];
        fibb[0] = 0;
        if(n==1) return fibb;
        fibb[1] = 1;
        return fibonacciRec(fibb, 2, n-2);
    }

    public static int[] fibonacciRec(int[] fibb, int start, int end){
        if(end==0)
            return fibb;
        fibb[start] = fibb[start-1]+fibb[start-2];
        return fibonacciRec(fibb, start+1, end-1);
    }
}
