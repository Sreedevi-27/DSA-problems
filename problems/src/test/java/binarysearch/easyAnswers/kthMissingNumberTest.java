package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class kthMissingNumberTest {
    @Test
    void findMissingNumber(){
        int[] inputArray = new int[]{2,3,4,7,11};
        int k = 5;
        int expectedOutput = 9;
        int actualOutput = kthMissingNumber.findKthPositive(inputArray, k);
        assertEquals(expectedOutput, actualOutput);
    }
}