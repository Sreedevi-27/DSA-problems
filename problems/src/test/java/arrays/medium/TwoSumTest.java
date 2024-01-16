package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void twoSum(){
        int[] inputArray = new int[]{2,7,11,15};
        int[] expectedOutputArray = new int[]{1,0};
        int[] actualOutputArray = TwoSum.twoSum(inputArray, 9);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}