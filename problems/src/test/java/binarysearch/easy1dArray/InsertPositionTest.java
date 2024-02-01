package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertPositionTest {
    @Test
    void testInsertPosition(){
        int[] inputArray = new int[]{1,3,5,6};
        int target = 5;
        int expectedOutput = 2;
        int actualOutput = InsertPosition.searchInsert(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void insertAtEnd(){
        int[] inputArray = new int[]{1,3,5,6};
        int target = 7;
        int expectedOutput = 4;
        int actualOutput = InsertPosition.searchInsert(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}