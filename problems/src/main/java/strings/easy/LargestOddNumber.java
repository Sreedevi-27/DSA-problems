/*
Largest Odd Number in String
You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a
non-empty substring of num, or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.

Example 1:
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

Constraints:
1 <= num.length <= 105
num only consists of digits and does not contain any leading zeros.
 */

package strings.easy;

public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        String str="";
        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            int n = Integer.parseInt(String.valueOf(ch));
            if(n%2==1) return num.substring(0, i+1);
        }
        return "";
    }
}
