package arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithGivenXORTest {

    @Test
    void testSubarrayWithGivenXOR(){
        int[] inputArray = new int[]{1,3,3,3,5};
        int target = 6;
        int expectedOutput = 2;
        int actualOutput = SubarrayWithGivenXOR.subarraysWithSumK(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}