package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerBoundTest {
    @Test
    void testWithStartingElement(){
        int[] inputArray = new int[]{-1,2,2,3,3,5};
        int target = -2;
        int expectedOutput = 0;
        int actualOutput = LowerBound.lowerBound(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithEndingElement(){
        int[] inputArray = new int[]{1,2,2,3,3,5};
        int target = 8;
        int expectedOutput = 6;
        int actualOutput = LowerBound.lowerBound(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}