package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroTest {
    @Test
    void testSetZeroMatrix(){
        int[][] inputArray = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        int[][] expectedArray = new int[][]{{0,0,0,0}, {0,4,5,0}, {0,3,1,0}};
        int[][] actualArray = SetMatrixZero.setZeroes(inputArray);
        assertArrayEquals(expectedArray, actualArray);
    }
}