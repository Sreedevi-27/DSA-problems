package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void findElement(){
        int[] inputArray = new int[]{-1,0,3,5,9,12};
        int target = 9;
        int expectedOutput = 4;
        int actualOutput = BinarySearch.search(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNoElementFound(){
        int[] inputArray = new int[]{-1,0,3,5,9,12};
        int target = 7;
        int expectedOutput = -1;
        int actualOutput = BinarySearch.search(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}