/*
Highest / Lowest Frequency Elements

Problem statement
Given an array 'v' of 'n' numbers. Your task is to find and return the highest and lowest frequency elements.
If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.

Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
Output: 1 2
Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest
frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].

Expected Time Complexity :
The expected time complexity is O(n), where n is the size of the array.

Expected Space Complexity :
The expected time complexity is O(n), where n is the size of the array.

Constraints :
2 <=  n <= 10^4
1 <= v[i] <= 10^9
There are at least two distinct elements in the array.
Time Limit: 1 sec
 */

package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {
    public static int[] getFrequencies(int []v) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<v.length; i++){
            if(hm.containsKey(v[i]))
                hm.put(v[i], hm.get(v[i])+1);
            else
                hm.put(v[i], 1);
        }

        int maxi = 0, mini = v.length;
        int maxKey = Integer.MAX_VALUE, minKey =  Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(maxi <= e.getValue()){
                if(maxi == e.getValue() || maxKey==Integer.MAX_VALUE) maxKey = Math.min(maxKey, e.getKey());
                else maxKey = e.getKey();
                maxi = e.getValue();
            }
            if(mini >= e.getValue()){
                if(mini == e.getValue() || minKey==Integer.MAX_VALUE) minKey = Math.min(minKey, e.getKey());
                else minKey = e.getKey();
                mini = e.getValue();

            }
        }

        System.out.println(maxKey);
        System.out.println(minKey);
        return new int[]{maxKey, minKey};
    }
}
