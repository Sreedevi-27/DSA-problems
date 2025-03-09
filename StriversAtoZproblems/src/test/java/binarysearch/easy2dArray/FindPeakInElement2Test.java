package binarysearch.easy2dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakInElement2Test {

    @Test
    void findPeakElement(){
        int[][] inputArray = new int[][]{{1,4}, {3,2}};
        int[] expectedOutputArray = new int[]{0,1};
        int[] actualOutputArray =FindPeakInElement2.findPeakGrid(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void findPeakElementWith2Ans(){
        int[][] inputArray = new int[][]{{10,20,15}, {21,30,14}, {7,16,32}};
        int[] expectedOutputArray = new int[]{1,1};
        int[] actualOutputArray =FindPeakInElement2.findPeakGrid(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}