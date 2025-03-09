package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayTest {
    @Test
    void sortedArray(){
        int[] inputArray = new int[]{4,5,6,6,8,9,10};
        int expectedOutput = 1;
        int actualOutput = SortedArray.isSorted(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void unsortedArray(){
        int[] inputArray = new int[]{4,5,6,-6,8,9,10};
        int expectedOutput = 0;
        int actualOutput = SortedArray.isSorted(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}