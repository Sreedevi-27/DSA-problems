/*
Count Digits

You are given a number 'n'. Find the number of digits of 'n' that evenly divide 'n'
Note:
A digit evenly divides 'n' if it leaves no remainder when dividing

Example:
Input: 'n' = 336
Output: 3
Explanation: 336 is divisible by both '3' and '6'. Since '3' occurs twice it is count

Expected Time Complexity:
Try to solve this in O(log(n))

Constraints:
1 <= ‘n’ <= 10^9
Time Limit: 1 sec
 */

package basics.math;

public class CountDigit {
    public static int countDigits(int n){
        int count = 0;
        int num = n;
        while(num>0){
            int rem = num%10;
            if(rem!=0 && n%rem==0) count++;
            num /= 10;
        }
        return count;
    }
}
