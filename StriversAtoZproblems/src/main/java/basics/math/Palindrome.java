/*
Check Palindrome

Check whether a given number ’n’ is a palindrome number.
Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function.

Example:
Input: 'n' = 51415
Output: true
Explanation: On reversing, 51415 gives 51415.

Expected time complexity:
The expected time complexity is O(log(n)).

Constraints :
1 <= n <= 10^9
Time Limit: 1 sec
 */

package basics.math;

public class Palindrome {
    public static boolean checkPalindrome(int n){
        int num = n;
        int rev=0, rem=0;
        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num /= 10;
        }
        return (rev==n);
    }
}
