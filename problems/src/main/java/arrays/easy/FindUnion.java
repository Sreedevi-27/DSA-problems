/*
Find Union

Given two sorted arrays, ‘a’ and ‘b’, of size ‘n’ and ‘m’, respectively, return the union of the arrays.
The union of two sorted arrays can be defined as an array consisting of the common and the distinct elements of
the two arrays. The final array should be sorted in ascending order.
Note: 'a' and 'b' may contain duplicate elements, but the union array must contain unique elements.
Example:
Input: ‘n’ = 5 ‘m’ = 3
‘a’ = [1, 2, 3, 4, 6]
‘b’ = [2, 3, 5]
Output: [1, 2, 3, 4, 5, 6]

Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
Distinct elements in ‘a’ are: [1, 4, 6]
Distinct elements in ‘b’ are: [5]
Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]

Expected Time Complexity:
O(( N + M )), where 'N' and ‘M’ are the sizes of Array ‘A’ and ‘B’.

Constraints :
1 <= 'n', 'm' <= 10^5
-10^9 <= 'a'[i], 'b'[i] <= 10^9
Time Limit: 1 sec
 */

package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class FindUnion {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list = new ArrayList<>();
        int i=0, j=0, x=a.length, y=b.length;
        while(i<x && j<y){
            if(a[i]<=b[j]){
                if(list.size()==0 || list.get(list.size()-1) != a[i])
                    list.add(a[i]);
                i++;
            }
            else{
                if(list.size()==0 || list.get(list.size()-1) != b[j])
                    list.add(b[j]);
                j++;
            }
        }
        while(i<x){
            if(list.size()==0 || list.get(list.size()-1) != a[i])
                list.add(a[i]);
            i++;
        }
        while(j<y){
            if(list.size()==0 || list.get(list.size()-1) != b[j])
                list.add(b[j]);
            j++;
        }
        return list;
    }
}
