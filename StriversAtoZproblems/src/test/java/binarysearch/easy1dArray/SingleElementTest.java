package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleElementTest {
    @Test
    void findSingleElement(){
        int[] inputArray = new int[]{1,1,2,3,3,4,4,8,8};
        int expectedOutput = 2;
        int actualOutput = SingleElement.singleNonDuplicate(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void NoSingleElement(){
        int[] inputArray = new int[]{1,1,2,2,3,3,4,4,8,8};
        int expectedOutput = -1;
        int actualOutput = SingleElement.singleNonDuplicate(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}