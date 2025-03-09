package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperBoundTest {
    @Test
    void testUpperBound(){
        int[] inputArray = new int[]{2,4,6,7};
        int target = 5;
        int expectedOutput = 2;
        int actualOutput = UpperBound.upperBound(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}