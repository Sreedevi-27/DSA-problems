package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumInRotatedSortedArrayTest {
    @Test
    void findMinimumElement(){
        int[] inputArray = new int[]{3,4,5,1,2};
        int expectedOutput = 1;
        int actualOutput = MinimumInRotatedSortedArray.findMin(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findMinimumElementInSortedArray(){
        int[] inputArray = new int[]{13,14,15,21,22};
        int expectedOutput = 13;
        int actualOutput = MinimumInRotatedSortedArray.findMin(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}