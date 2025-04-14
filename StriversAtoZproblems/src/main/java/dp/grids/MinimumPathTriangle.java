/*
120. Triangle

Given a triangle array, return the minimum path sum from top to bottom.
For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current
row, you may move to either index i or index i + 1 on the next row.

Example 1:
Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).

Example 2:
Input: triangle = [[-10]]
Output: -10

Constraints:
1 <= triangle.length <= 200
triangle[0].length == 1
triangle[i].length == triangle[i - 1].length + 1
-104 <= triangle[i][j] <= 104
 */

package dp.grids;

import java.util.ArrayList;
import java.util.List;

public class MinimumPathTriangle {
    public static int memoization(List<List<Integer>> triangle){
        List<List<Integer>> dp = new ArrayList<>();
        int row = triangle.size();
        for(int i=0; i<row; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<triangle.get(i).size(); j++){
                list.add(-1);
            }
            dp.add(list);
        }
        return memoizationHelper(triangle, dp, 0, row-1, 0);
    }

    public static int memoizationHelper(List<List<Integer>> triangle, List<List<Integer>> dp, int row, int size, int index){
        if(row==size) return triangle.get(row).get(index);
        int currIndexSize = triangle.get(row).size();
        if(index>=currIndexSize) return (int) Math.pow(10, 9);

        if(dp.get(row).get(index)!=-1) return dp.get(row).get(index);
        int num = triangle.get(row).get(index);
        int same = num + memoizationHelper(triangle, dp, row+1, size, index);
        int next = num + memoizationHelper(triangle, dp, row+1, size, index+1);
        int minValue = Math.min(same, next);
        dp.get(row).set(index, minValue);
        return minValue;
    }

    public static int tabulation(List<List<Integer>> triangle){
        List<List<Integer>> dp = new ArrayList<>();
        int row = triangle.size();
        for(int i=0; i<row; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<triangle.get(i).size(); j++){
                list.add(-1);
            }
            dp.add(list);
        }

        List<Integer> lastRow = triangle.get(row-1);
        for(int i=0; i<lastRow.size(); i++){
            dp.get(row-1).set(i, triangle.get(row-1).get(i));
        }

        for(int i=row-2; i>=0; i--){
            List<Integer> curr = triangle.get(i);
            for(int j=curr.size()-1; j>=0; j--){
                int num = triangle.get(i).get(j);
                int same = num + dp.get(i+1).get(j);
                int next = num + dp.get(i+1).get(j+1);
                int minValue = Math.min(same, next);
                dp.get(i).set(j, minValue);
            }
        }
        return dp.get(0).get(0);
    }


    public static int tabulationSpaceOptimized(List<List<Integer>> triangle){
        int row = triangle.size();
        List<Integer> prev = new ArrayList<>();

        List<Integer> lastRow = triangle.get(row-1);
        for(int i=0; i<lastRow.size(); i++){
            prev.add(lastRow.get(i));
        }

        for(int i=row-2; i>=0; i--){
            List<Integer> temp = new ArrayList<>();
            List<Integer> curr = triangle.get(i);
            for(int j=0; j<curr.size(); j++){
                int num = curr.get(j);
                int same = num + prev.get(j);
                int next = num + prev.get(j+1);
                int minValue = Math.min(same, next);
                temp.add(minValue);
            }
            prev = temp;
        }
        return prev.get(0);
    }
}
