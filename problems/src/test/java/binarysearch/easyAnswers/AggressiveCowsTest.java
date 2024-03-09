package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AggressiveCowsTest {
    @Test
    void maximumDistance(){
        int[] inputArray = new int[]{0,3,4,7,10,9};
        int k = 4;
        int expectedOutput = 3;
        int actualOutput = AggressiveCows.aggressiveCows(inputArray, k);
        assertEquals(expectedOutput, actualOutput);
    }
}