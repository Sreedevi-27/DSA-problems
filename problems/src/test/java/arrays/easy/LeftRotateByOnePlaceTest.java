package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotateByOnePlaceTest {
    @Test
    void testLeftRotateArray(){
        int[] inputArray = new int[]{1,2,3,4,5,6,7};
        int[] expectedOutputArray = new int[]{2,3,4,5,6,7,1};
        int[] actualOutputArray = LeftRotateByOnePlace.rotateArray(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}