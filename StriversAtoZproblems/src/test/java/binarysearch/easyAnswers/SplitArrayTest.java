package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitArrayTest {
    @Test
    void splitArray(){
        int[] inputArray = new int[]{7,2,5,10,8};
        int k = 2;
        int expectedOutput = 18;
        int actualOutput = SplitArray.splitArray(inputArray, k);
        assertEquals(expectedOutput, actualOutput);
    }
}