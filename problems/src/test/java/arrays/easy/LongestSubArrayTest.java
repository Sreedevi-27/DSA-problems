package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubArrayTest {
    @Test
    void withPositiveElements(){
        int[] inputArray = new int[]{1, 2, 3, 1, 1, 1, 1};
        int expectedOutput = 3;
        int actualOutput = LongestSubArray.withOnlyPositiveElementsInArray(inputArray, 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void withPositiveNegativeElements(){
        int[] inputArray = new int[]{-5,0,0,5,2};
        int expectedOutput = 5;
        int actualOutput = LongestSubArray.withPositiveNegativeElementsInArray(inputArray, 2);
        assertEquals(expectedOutput, actualOutput);
    }
}