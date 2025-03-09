/*
Check Palindrome (recursive)

Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a
palindrome and false if it is not.
Note: You are not required to print anything, just implement the function.

Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.

Constraints:
0 <= |S| <= 10^6
where |S| represents the length of string S.
 */

package basics.recursion;

public class PalindromeRecursion {
    public static boolean isPalindrome(String str) {
        return checkPalindrome(str, 0, str.length()-1);
    }

    public static boolean checkPalindrome(String str, int start, int end){
        if(start>=end)
            return true;
        if(str.charAt(start)!=str.charAt(end)) return false;
        return checkPalindrome(str, start+1, end-1);
    }
}
