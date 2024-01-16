package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleElementInUnsortedArrayTest {
    @Test
    void findSingleElement(){
        int[] inputArray = new int[]{4,1,2,1,2};
        int expectedOutput = 4;
        int actualOutput = SingleElementInUnsortedArray.singleNumber(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findSingleElementWithSmallArray(){
        int[] inputArray = new int[]{5};
        int expectedOutput = 5;
        int actualOutput = SingleElementInUnsortedArray.singleNumber(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}