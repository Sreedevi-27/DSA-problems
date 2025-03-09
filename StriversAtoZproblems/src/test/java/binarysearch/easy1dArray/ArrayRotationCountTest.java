package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRotationCountTest {
    @Test
    void findRotationCount(){
        int[] inputArray = new int[]{3,4,5,1,2};
        int expectedOutput = 3;
        int actualOutput = ArrayRotationCount.findKRotation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNonRotatedArray(){
        int[] inputArray = new int[]{3,4,5,6,7};
        int expectedOutput = 0;
        int actualOutput = ArrayRotationCount.findKRotation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}