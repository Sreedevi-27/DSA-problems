package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayEqualToSumTest {
    @Test
    void testSubArraySum(){
        int[] inputArray = new int[]{1,1,1};
        int sum = 2;
        int expectedOutput = 2;
        int actualOutput = SubarrayEqualToSum.subarraySum(inputArray, sum);
        assertEquals(expectedOutput, actualOutput);
    }
}