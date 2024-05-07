/*
Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
 */

package strings.medium;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int len = s.length();
        int max = 0;
        String ans = new String();
        for(int i=0; i<len; i++){
            for(int j=i+1; j<=len; j++){
                String str = s.substring(i,j);
                if(isPalindrome(str)){
                    if(max < str.length()){
                        max = str.length();
                        ans = str;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String str){
        int len = str.length();
        for(int i=0; i<len/2; i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(len-i-1);
            if(c1 != c2) return false;
        }
        return true;
    }
}
