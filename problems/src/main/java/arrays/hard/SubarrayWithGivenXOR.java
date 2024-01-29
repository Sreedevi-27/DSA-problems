/*
Subarray with given XOR

Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equals to B.

Example
Input 1:
 A = [4, 2, 2, 6, 4]
 B = 6
Output : 4

Problem Constraints
1 <= length of the array <= 105
1 <= A[i], B <= 109
 */

package arrays.hard;

import java.util.HashMap;

public class SubarrayWithGivenXOR {
    public static int subarraysWithSumK(int []a, int b) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int sum=0, count=0;
        for(int i=0; i<a.length; i++){
            sum = sum^a[i];
            int rem = sum ^ b;
            if(hm.containsKey(rem)){
                count += hm.get(rem);
            }
            if(hm.containsKey(sum))
                hm.put(sum, hm.get(sum)+1);
            else
                hm.put(sum, 1);
        }
        return count;
    }
}
