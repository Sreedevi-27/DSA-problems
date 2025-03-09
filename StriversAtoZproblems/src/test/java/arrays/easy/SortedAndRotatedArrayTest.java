package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedAndRotatedArrayTest {
    @Test
    void sortedAndRotatedArray(){
        int[] inputArray = new int[]{3,4,5,1,2};
        boolean expectedOutput = true;
        boolean actualOutput = SortedAndRotatedArray.checkSortedAndRotatedArray(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void notSortedAndRotatedArray(){
        int[] inputArray = new int[]{2,1,3,4};
        boolean expectedOutput = false;
        boolean actualOutput = SortedAndRotatedArray.checkSortedAndRotatedArray(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void sortedArray(){
        int[] inputArray = new int[]{1,2,3,4,5};
        boolean expectedOutput = true;
        boolean actualOutput = SortedAndRotatedArray.checkSortedAndRotatedArray(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}