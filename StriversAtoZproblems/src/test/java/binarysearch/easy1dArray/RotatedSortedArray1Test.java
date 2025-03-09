package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatedSortedArray1Test {
    @Test
    void findElement(){
        int[] inputArray = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        int expectedOutput = 4;
        int actualOutput = RotatedSortedArray1.search(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNoElementFound(){
        int[] inputArray = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        int expectedOutput = -1;
        int actualOutput = RotatedSortedArray1.search(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}