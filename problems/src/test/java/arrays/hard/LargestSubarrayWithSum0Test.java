package arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSubarrayWithSum0Test {
    @Test
    void testSubarrayWithSum0(){
        int[] inputArray = new int[]{1,0,-1,1};
        int expectedOutput = 3;
        int actualOutput = LargestSubarrayWithSum0.getLongestZeroSumSubarrayLength(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNoSubarrayWithSum0(){
        int[] inputArray = new int[]{1,1};
        int expectedOutput = 0;
        int actualOutput = LargestSubarrayWithSum0.getLongestZeroSumSubarrayLength(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}