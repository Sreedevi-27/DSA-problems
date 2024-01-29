/*
Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle. In Pascal's triangle, each number is the
sum of the two numbers directly above it as shown:
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1

Example:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Constraints:
1 <= numRows <= 30
 */

package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i)
                    list.add(1);
                else{
                    List<Integer> l1 = finalList.get(i-1);
                    int n = l1.get(j-1)+l1.get(j);
                    list.add(n);
                }
            }
            finalList.add(list);
        }
        return finalList;
    }
}

