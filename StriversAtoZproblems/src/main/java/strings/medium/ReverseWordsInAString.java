/*
Reverse Words in a String

Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only
have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s
 */

package strings.medium;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] sArray = s.trim().split(" ");
        for(int i=sArray.length-1; i>=0; i--){
            if(!sArray[i].isEmpty())
                result.append(sArray[i]).append(" ");
        }
        return result.toString().trim();
    }
}
