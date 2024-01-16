/*
Left Rotate array

Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
Example:
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.

Expected Time Complexity:
O(n), where ‘n’ is the size of the array ‘arr’ and ‘k’ is the number of rotations.

Constraints:
1 <= 'n' <= 10^3
1 <= 'arr'[i] <= 10^9
1 <= 'k' < 'n'
 */

package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class LeftRotateArray {
    public static ArrayList<Integer> rotateArray(List<Integer> arr, int k) {
        int arrLength = arr.size();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arrLength; i++)
            result.add(arr.get((i+k)%arrLength));
        return result;
    }
}
