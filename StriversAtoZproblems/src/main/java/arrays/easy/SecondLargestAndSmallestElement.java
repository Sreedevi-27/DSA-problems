/*
Second Largest and Second Smallest Number

You have been given an array ‘a’ of ‘n’ unique non-negative integers. Find the second largest and second smallest element
from the array. Return the two elements (second largest and second smallest) as another array of size 2.

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]
The second largest element after 5 is 4, and the second smallest element after 1 is 2.

Expected Time Complexity:
O(n), Where ‘n’ is the size of an input array ‘a’.

Constraints:
2 ≤ 'n' ≤ 10^5
0 ≤ 'a'[i] ≤ 10^9
Time limit: 1 sec
 */

package arrays.easy;

public class SecondLargestAndSmallestElement {
    public static int[] getSecondOrderElements(int []a) {
        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = a[i];
            } else if(a[i] > secondLargest)
                secondLargest = a[i];

            if(a[i]<firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = a[i];
            } else if(a[i]<secondSmallest)
                secondSmallest = a[i];
        }
        return new int[]{secondLargest, secondSmallest};
    }
}
