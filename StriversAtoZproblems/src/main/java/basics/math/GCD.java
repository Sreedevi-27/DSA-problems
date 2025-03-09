/*
Find GCD

Calculate and return GCD(Greatest Common Divisor) of two given numbers x and y.
Note : Numbers should be in range of Integer.

Example:
Input : 20  5
Output : 5

Expected Time Complexity:
O(logɸmin(a,b)), where ɸ is 1.61.

Constraints:
1 <= a, b <= 10^9
Time Limit: 1 sec
 */

package basics.math;

public class GCD {
    public static int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
