package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfSortedArraysTest {
    @Test
    void testWithEvenSize(){
        int[] inputArray1 = new int[]{1,3,5,7};
        int[] inputArray2 = new int[]{2,8,9,15,18,19};
        double expectedOutput = 7.5;
        double actualOutput = MedianOfSortedArrays.findMedianSortedArrays(inputArray1, inputArray2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithOddSize(){
        int[] inputArray1 = new int[]{1,3,5,7};
        int[] inputArray2 = new int[]{2,8,9,15,19};
        double expectedOutput = 7.0;
        double actualOutput = MedianOfSortedArrays.findMedianSortedArrays(inputArray1, inputArray2);
        assertEquals(expectedOutput, actualOutput);
    }
}