package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    void testSort(){
        int[] input = new int[]{15,17,92,63,14,0,62,-1,2,14};
        int[] expectedOutput = new int[]{-1,0,2,14,14,15,17,62,63,92};
        int[] actualOutput = InsertionSort.insertionSort(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}