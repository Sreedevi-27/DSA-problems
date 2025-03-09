package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestDivisorTest {
    @Test
    void findSmallestDivisor(){
        int[] inputArray = new int[]{1,2,5,9};
        int threshold = 6;
        int expectedOutput = 5;
        int actualOutput = SmallestDivisor.smallestDivisor(inputArray, threshold);
        assertEquals(expectedOutput, actualOutput);
    }
}