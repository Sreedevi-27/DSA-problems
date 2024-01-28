/*
Longest Successive Elements

There is an integer array ‘A’ of size ‘N’. A sequence is successive when the adjacent elements of the sequence have a
difference of 1. You must return the length of the longest successive sequence.

Note:
You can reorder the array to form a sequence.
For example,

Input:
A = [5, 8, 3, 2, 1, 4], N = 6
Output:
5
Explanation:
The resultant sequence can be 1, 2, 3, 4, 5.
The length of the sequence is 5.
Detailed explanation ( Input/output format, Notes, Images )

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^9
Time Limit: 1 sec
 */

package arrays.medium;

import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int ele : nums) hashSet.add(ele);

        int maxLen=1, count=1;
        Iterator<Integer> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Integer ele = iterator.next();
            count=1;
            if(!hashSet.contains(ele-1)){
                while(hashSet.contains(ele+1)){
                    count++;
                    ele++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
