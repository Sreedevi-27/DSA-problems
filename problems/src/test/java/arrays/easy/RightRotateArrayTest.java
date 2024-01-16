package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightRotateArrayTest {

    @Test
    void testRightRotateArray(){
        int[] inputArray = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int[] expectedOutputArray = new int[]{5,6,7,1,2,3,4};
        int[] actualOutputArray = RightRotateArray.rotateArray(inputArray, k);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}