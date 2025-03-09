/*
Check Armstrong Number

You are given an integer 'n'. Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.
Note:
An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is
equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

Example:
Input: 'n' = 1634
Output: true
Explanation:
1634 is an Armstrong number, as 1^4 + 6^4 + 3^4 + 4^4 = 1634

Expected Time Complexity:
Try to solve this in O(log(n)).

Constraints:
1 <= ‘n’ <= 10^9
Time Limit: 1 sec
 */

package basics.math;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int n){
        int num = n, count=0, sum=0;
        while(num!=0){
            count++;
            num/=10;
        }
        num = n;
        while(num!=0){
            sum += Math.pow(num%10, count);
            num/=10;
        }

        if(sum==n)
            return true;
        return false;
    }
}
