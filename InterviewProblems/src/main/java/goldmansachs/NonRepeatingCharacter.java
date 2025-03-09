/*
Non Repeating Character

Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is
no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:
Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.

Input: s = "aabbccc"
Output: -1
Explanation: All the characters in the given string are repeating.
 */

package goldmansachs;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    static char nonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c) && map.get(c) == 1)
                return c;
        }
        return '$';
    }

    public static void main(String[] args){
        char c = nonRepeatingChar("geeksforgeeks");
        if(c=='$') System.out.println("-1");
        else System.out.println(c);
    }
}
