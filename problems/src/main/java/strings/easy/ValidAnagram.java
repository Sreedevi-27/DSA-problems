/*
Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the
original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */

package strings.easy;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        if(len1 != len2) return false;
        int[] freq1 = new int[26];

        for(int i=0; i<len1; i++)
            freq1[s.charAt(i)-'a']++;
        for(int i=0; i<len1; i++)
            freq1[t.charAt(i)-'a']--;

        for(int i=0; i<26; i++){
            if(freq1[i] != 0) return false;
        }
        return true;
    }
}
