package binarysearch.easy2dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchIn2DMatrix2Test {
    @Test
    void searchInMatrix(){
        int[][] inputArray = new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}};
        int target = 5;
        boolean expectedOutput = true;
        boolean actualOutput = SearchIn2DMatrix2.searchMatrix(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void searchInMatrixWithNoTargetFound(){
        int[][] inputArray = new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}};
        int target = 18;
        boolean expectedOutput = false;
        boolean actualOutput = SearchIn2DMatrix2.searchMatrix(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}