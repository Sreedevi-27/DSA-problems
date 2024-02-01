package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOccurrenceTest {
    @Test
    void findOccurrence(){
        int[] inputArray = new int[]{1,1,1,2,2,3,3};
        int target = 3;
        int expectedOutput = 2;
        int actualOutput = NumberOfOccurrence.count(inputArray,target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findNoOccurrence(){
        int[] inputArray = new int[]{1,2,4,4,5};
        int target = 6;
        int expectedOutput = 0;
        int actualOutput =  NumberOfOccurrence.count(inputArray,target);
        assertEquals(expectedOutput, actualOutput);
    }
}