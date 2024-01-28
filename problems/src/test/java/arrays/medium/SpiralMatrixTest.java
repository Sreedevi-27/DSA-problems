package arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
    @Test
    void test3X3Matrix(){
        int[][] inputMatrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        List<Integer> expectedOutput = Arrays.asList(1,2,3,6,9,8,7,4,5);
        List<Integer> actualOutput = SpiralMatrix.spiralOrder(inputMatrix);
        Integer[] expectedOutputArray = expectedOutput.stream().toArray(Integer[] ::new);
        Integer[] actualOutputArray = actualOutput.stream().toArray(Integer[] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void test3X4Matrix(){
        int[][] inputMatrix = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        List<Integer> expectedOutput = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
        List<Integer> actualOutput = SpiralMatrix.spiralOrder(inputMatrix);
        Integer[] expectedOutputArray = expectedOutput.stream().toArray(Integer[] ::new);
        Integer[] actualOutputArray = actualOutput.stream().toArray(Integer[] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}