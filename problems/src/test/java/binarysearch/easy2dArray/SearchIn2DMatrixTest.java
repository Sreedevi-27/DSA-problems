package binarysearch.easy2dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchIn2DMatrixTest {
    @Test
    void searchInMatrix(){
        int[][] inputArray = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}, {72,89,102,156}};
        int target = 156;
        boolean expectedOutput = true;
        boolean actualOutput = SearchIn2DMatrix.searchMatrix(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void searchInMatrixWithNoTargetFound(){
        int[][] inputArray = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}, {72,89,102,156}};
        int target = 27;
        boolean expectedOutput = false;
        boolean actualOutput = SearchIn2DMatrix.searchMatrix(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}