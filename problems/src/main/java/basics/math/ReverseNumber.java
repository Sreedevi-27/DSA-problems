/*
Reverse Number

You are given a number 'n'. Reverse the number and print it.

Example 1:
Input: N = 123
Output: 321
Explanation: The reverse of 123 is 321

Expected Time Complexity:
Try to solve this in O(n)

Constraints:
1 <= ‘n’ <= 10^9
Time Limit: 1 sec
 */

package basics.math;

public class ReverseNumber {
    public static int reverseNumber(int num){
        int rev = 0;
        while(num>0){
           rev = (rev*10) + num%10;
           num = num/10;
        }
        return rev;
    }
}
