/*
Sort Characters By Frequency

Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is
the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

Example 1:
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Constraints:
1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.
 */

package strings.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
                (a,b)-> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }
}
