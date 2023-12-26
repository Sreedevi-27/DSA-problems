/*
Print Sum of N numbers

You are given an integer ‘n’. Your task is determining the sum of the first ‘n’ natural numbers and returning it.

Example:
Input: ‘n’ = 3
Output: 6
Explanation: The sum of the first 3 natural numbers is 1 + 2 + 3, equal to 6.

Expected Time Complexity:
The expected time complexity is O(1).
Expected Space Complexity:
The expected space complexity is O(1).

Constraints:
1 <= n <= 10^9
Time Limit: 1 sec
 */

package basics.recursion;

public class SumOfNnumbers {
    static long sum = 0;
    public static long sumFirstN(long n) {
        if(n==0)
            return sum;
        sum += n;
        return sumFirstN(n-1);
    }
}
