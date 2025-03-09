/*
Longest Subarray With Zero Sum

Problem statement
Ninja is given an array ‘Arr’ of size ‘N’. You have to help him find the longest subarray of ‘Arr’, whose sum is 0.
You must return the length of the longest subarray whose sum is 0.

For Example:
For N = 5, and Arr = {1, -1, 0, 0, 1},
We have the following subarrays with zero sums:
{{1, -1}, {1, -1, 0}, {1, -1, 0, 0}, {-1, 0, 0, 1}, {0}, {0, 0}, {0}}
Among these subarrays, {1, -1, 0, 0} and {-1, 0, 0, 1} are the longest subarrays with their sum equal to zero.
Hence the answer is 4.

Sample Input 1:
4
1 0 -1 1
Sample Output 1:
3
Explanation of Sample Input 1:
The subarrays with sums equal to zero are: {{1, 0, -1}, {0}, {0, -1, 1}, {-1, 1}}.
Among these, {1, 0, -1} and {0, -1, 1} are the longest with length equal to 3.
Hence the answer is 3.

Constraints:
1 <= N <= 10^5
-10^9 <= Arr[i] <= 10^9

The sum of ‘N’ over all test cases is less than or equal to 10^5.
Time Limit: 1 sec.
 */

package arrays.hard;

import java.util.HashMap;

public class LargestSubarrayWithSum0 {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int count=0,sum=0, max=0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum==0){
                count = Math.max(count, i+1);
            }
            if(!hashMap.containsKey(sum))
                hashMap.put(sum,i);
            else
                count = Math.max(count, i-hashMap.get(sum));
        }
        return count;
    }
}
