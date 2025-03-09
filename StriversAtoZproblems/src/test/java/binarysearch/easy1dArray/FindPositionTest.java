package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPositionTest {
    @Test
    void findPosition(){
        int[] inputArray = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] expectedOutputArray = new int[]{3,4};
        int[] actualOutputArray = FindPosition.searchRange(inputArray, target);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void testWithEmptyArray(){
        int[] inputArray = new int[]{};
        int target = 0;
        int[] expectedOutputArray = new int[]{-1,-1};
        int[] actualOutputArray = FindPosition.searchRange(inputArray, target);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}