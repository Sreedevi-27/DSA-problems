package binarysearch.easy2dArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RowWithMax1sTest {
    @Test
    void testWithMatrix(){
        List<List<Integer>> inputList = Arrays.asList(Arrays.asList(0,0,1), Arrays.asList(1,1,1), Arrays.asList(0,0,1));
        int expectedOutput = 1;
        int actualOutput = RowWithMax1s.maximumOnesRow(inputList);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithMatrixWithSameRow(){
        List<List<Integer>> inputList = Arrays.asList(Arrays.asList(0,0,1,1), Arrays.asList(0,1,1,1), Arrays.asList(0,1,1,1));
        int expectedOutput = 1;
        int actualOutput = RowWithMax1s.maximumOnesRow(inputList);
        assertEquals(expectedOutput, actualOutput);
    }
}