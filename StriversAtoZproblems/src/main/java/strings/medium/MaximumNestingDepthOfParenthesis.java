/*
Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

Constraints:
1 <= s.length <= 100
s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
It is guaranteed that parentheses expression s is a VPS.
 */

package strings.medium;

public class MaximumNestingDepthOfParenthesis {
    public static int maxDepth(String s) {
        int count=0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(') count++;
            else if(c==')') count--;
            max = Math.max(max, count);
        }
        return max;
    }
}
