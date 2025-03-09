/*
Search a 2D Matrix

You are given an m x n integer matrix matrix with the following two properties:  Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row. Given an integer target, return true
if target is in matrix or false otherwise. You must write a solution in O(log(m * n)) time complexity.

Example 1
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
 */

package binarysearch.easy2dArray;

public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, column = matrix[0].length;
        int low = 0, high = row*column-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            int r = mid/column;
            int c = mid%column;
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c] > target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
