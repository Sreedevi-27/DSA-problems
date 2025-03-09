package arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {
    @Test
    void findMaximumProduct(){
        int[] inputArray = new int[]{2,3,-2,4};
        int expectedOutput = 6;
        int actualOutput = MaximumProductSubarray.maxProduct(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithZeros(){
        int[] inputArray = new int[]{-2,0,-1};
        int expectedOutput = 0;
        int actualOutput = MaximumProductSubarray.maxProduct(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}