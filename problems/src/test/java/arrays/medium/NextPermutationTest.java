package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {
    @Test
    void testNextPermutation(){
        int[] inputArray = new int[]{1,2,3};
        int[] expectedOutput = new int[]{1,3,2};
        int[] actualOutput = NextPermutation.nextPermutation(inputArray);
        assertArrayEquals(expectedOutput,actualOutput);
    }

    @Test
    void testNextPermutationWithReverse(){
        int[] inputArray = new int[]{3,2,1};
        int[] expectedOutput = new int[]{1,2,3};
        int[] actualOutput = NextPermutation.nextPermutation(inputArray);
        assertArrayEquals(expectedOutput,actualOutput);
    }
}