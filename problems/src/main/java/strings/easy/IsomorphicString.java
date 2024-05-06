/*
Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s
can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the
order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Constraints:
1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 */

package strings.easy;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!(s.indexOf(c1)==t.indexOf(c2)))
                return false;
        }
        return true;
    }
}
