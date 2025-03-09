/* Repeating Character - First Appearance Leftmost
You are given a string S (both uppercase and lowercase characters). You need to print the index of repeated character
whose first appearance is leftmost.

Example 1:
Input:
S = geeksforgeeks
Output: 0
Explanation: We see that both e and g
repeat as we move from left to right.
But the leftmost is g so we print g.
 */


package goldmansachs;

import java.util.HashMap;
import java.util.Map;

public class LeftMostRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(findRepeatedCharacter("rahulgorai"));
    }

    public static int findRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c) && map.get(c) > 1)
                return i;
        }
        return -1;
    }
}
