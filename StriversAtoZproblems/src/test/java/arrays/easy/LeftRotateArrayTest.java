package arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotateArrayTest {
    @Test
    void testLeftRotate(){
        List<Integer> inputList = Arrays.asList(7,5,2,11,2,43,1,1);
        List<Integer> expectedOutputList = Arrays.asList(2,11,2,43,1,1,7,5);
        List<Integer> actualOutputList = LeftRotateArray.rotateArray(inputList, 2);
        assertEquals(expectedOutputList, actualOutputList);
    }
}