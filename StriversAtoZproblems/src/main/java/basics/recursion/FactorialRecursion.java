/*
Factorial Numbers Not Greater Than N

You are given an integer ’n’. Your task is to return a sorted array (in increasing order) containing all the
factorial numbers which are less than or equal to ‘n’.
The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.
Note:
In the output, you will see the array returned by you.

Example:
Input: ‘n’ = 7
Output: 1 2 6
Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’.

Expected Time Complexity:
The expected time complexity is O(m), where ‘m’ is the number of factorial numbers which are less than or equal to ‘n’.
Expected Space Complexity:
The expected space complexity is O(m), where ‘m’ is the number of factorial numbers which are less than or equal to ‘n’.

Constraints:
1 <= n <= 10^18
Time Limit: 1-sec
 */

package basics.recursion;

import java.util.ArrayList;
import java.util.List;

public class FactorialRecursion {
    public static List<Long> factorialNumbers(long n) {
        List<Long> list = new ArrayList<>();
        return printFactorials(list, 1, n, 1);
    }

    public static List<Long> printFactorials(List<Long> list, long start, long n, long fact){
        fact = start*fact;
        if(fact>n)
            return list;
        list.add(fact);
        return printFactorials(list, start+1, n, fact);
    }
}
