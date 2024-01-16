package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovesZeroToEndTest {
    @Test
    void testMoveZerosToEnd(){
        int[] inputArray = new int[]{0,1,0,3,12};
        int[] expectedOutputArray = new int[]{1,3,12,0,0};
        int[] actualOutputArray = MovesZeroToEnd.moveZeros(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void testWithZero(){
        int[] inputArray = new int[]{0};
        int[] expectedOutputArray = new int[]{0};
        int[] actualOutputArray = MovesZeroToEnd.moveZeros(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}