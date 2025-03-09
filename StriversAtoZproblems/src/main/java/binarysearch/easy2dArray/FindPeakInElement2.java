/*
Find a Peak Element II

A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right,
top, and bottom. Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j]
and return the length 2 array [i,j].
You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.
You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.

Example 1:
Input: mat = [[1,4],[3,2]]
Output: [0,1]
Explanation: Both 3 and 4 are peak elements so [1,0] and [0,1] are both acceptable answers.

Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 500
1 <= mat[i][j] <= 105
No two adjacent cells are equal.
 */

package binarysearch.easy2dArray;

public class FindPeakInElement2 {
    public static int[] findPeakGrid(int[][] mat) {
        int low=0, high=mat[0].length;
        int row = mat.length, column=mat[0].length;
        while(low<=high){
            int c = low+(high-low)/2;
            int r = findMaxElement(mat, c);
            int top = (r<=0) ? -1 : mat[r-1][c];
            int bottom = (r+1>=row) ? -1 : mat[r+1][c];
            int left = (c<=0) ? -1 : mat[r][c-1];
            int right = (c+1>=column) ? -1 : mat[r][c+1];
            if(mat[r][c]>=top && mat[r][c]>=bottom && mat[r][c]>=left && mat[r][c]>=right)
                return new int[]{r, c};
            else if(mat[r][c]<left) high=c-1;
            else low=c+1;
        }
        return new int[]{-1,-1};
    }

    public static int findMaxElement(int[][] matrix, int col){
        int len = matrix.length, max=-1;
        int rowIndex=-1;
        for(int i=0; i<len; i++){
            if(matrix[i][col]>max){
                max = matrix[i][col];
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}
