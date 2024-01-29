package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    @Test
    void maxSum(){
        int[] inputArray = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int expectedOutput = 6;
        int actualOutput = MaximumSubarray.maxSubArray(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}