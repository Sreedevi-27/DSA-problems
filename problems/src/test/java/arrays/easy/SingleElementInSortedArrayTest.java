package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleElementInSortedArrayTest {
    @Test
    void findSingleElement(){
        int[] inputArray = new int[]{4,4,6,6,8,9,9};
        int expectedOutput = 8;
        int actualOutput = SingleElementInSortedArray.getSingleElement(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}