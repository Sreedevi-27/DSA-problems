package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakElementTest {
    @Test
    void findPeakElement(){
        int[] inputArray = new int[]{1,2,3,1};
        int expectedOutput = 2;
        int actualOutput = PeakElement.findPeakElement(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void NoSingleElement(){
        int[] inputArray = new int[]{1,2,1,3,5,6,4};
        int expectedOutput = 5;
        int actualOutput =  PeakElement.findPeakElement(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}