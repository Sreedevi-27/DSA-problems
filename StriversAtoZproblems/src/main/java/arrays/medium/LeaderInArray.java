/*
Leaders in a Array

There is an integer array ‘a’ of size ‘n’. An element is called a Superior Element if it is greater than all
the elements present to its right. You must return an array all Superior Elements in the array ‘a’.

Note:
The last element of the array is always a Superior Element.

Example 1:
Input: a = [1, 2, 3, 2], n = 4
Output: 2 3
Explanation:
a[ 2 ] = 3 is greater than a[ 3 ]. Hence it is a Superior Element.
a[ 3 ] = 2 is the last element. Hence it is a Superior Element.
The final answer is in sorted order.

Expected Time Complexity:
Try to solve this in O(n).

Constraints:
1 <= n <=10^5
1 <= a[i] <= 10^9
Time Limit: 1 sec
 */

package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> superiorElements = new ArrayList<>();
        int len = a.length, max = 0;
        for(int i=len-1; i>=0; i--){
            if(a[i]>max){
                max = a[i];
                superiorElements.add(a[i]);
            }
        }
        return superiorElements;
    }
}
