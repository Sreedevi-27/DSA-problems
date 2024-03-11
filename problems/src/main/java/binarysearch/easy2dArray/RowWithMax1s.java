/*
Row with max 1s

You are given a 2D matrix 'ARR' (containing either ‘0’ or ‘1’) of size 'N' x 'M', where each row is in sorted order.
Find the 0-based index of the first row with the maximum number of 1's.
Note :
If two rows have the same number of 1’s, return the row with a lower index.
If no row exists where at-least one '1' is present, return -1.

Example 1:
Input: ‘N’ = 3, 'M' = 3
'ARR' =
[     [ 1,  1,  1 ],
      [ 0,  0,  1 ],
      [ 0,  0,  0 ]   ]
Output: 0
Explanation: The 0th row of the given matrix has the maximum number of ones.

Constraints :
1 ≤ N, M ≤ 100
0 ≤ ARR[i][j] ≤ 1
Where ARR[i][j] denotes the matrix elements.
Time Limit: 1 sec
 */

package binarysearch.easy2dArray;

import java.util.ArrayList;
import java.util.List;

public class RowWithMax1s {
    public static int maximumOnesRow(List<List<Integer>> matrix) {
        int maximumOnes = -1, index=-1;
        for(int i=0; i<matrix.size(); i++){
            List<Integer> list = matrix.get(i);
            int firstIndex = matrix.size()-findFirstIndex(list, 1);
            if(firstIndex > maximumOnes){
                maximumOnes = firstIndex;
                index=i;
            }
        }
        return index;
    }

    public static int findFirstIndex(List<Integer> list, int x){
        int size = list.size(), ans = size;
        int left = 0, right = size-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(list.get(mid)==1){
                ans = mid;
                right = mid-1;
            }
            else left = mid+1;
        }
        return ans;
    }
}
