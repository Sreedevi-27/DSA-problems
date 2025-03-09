/*
String to Integer (atoi)

Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
The algorithm for myAtoi(string s) is as follows:
Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the
string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range.
Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.

Example 1:
Input: s = "42"
Output: 42
Explanation:
The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)

Constraints:
0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */

package strings.medium;

public class StringToInteger {
    public static int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;

        int sign = 1;
        int index=0;
        if(s.charAt(0)=='-'){
            index++;
            sign = -1;
        } else if(s.charAt(0)=='+') index++;

        int result = rec(s, index, 0, sign);
        if(sign==-1) return result*-1;
        return result;
    }


    public static int rec(String s, int i, int result, int sign) {
        if(i>=s.length() || !Character.isDigit(s.charAt(i)))
            return result;
        int digit = s.charAt(i)-'0';
        if(result > Integer.MAX_VALUE/10  || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
            if(sign==-1) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        return rec(s, i+1, (result*10)+digit, sign);
    }
}
