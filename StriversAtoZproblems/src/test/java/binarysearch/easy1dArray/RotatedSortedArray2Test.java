package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatedSortedArray2Test {
    @Test
    void searchElement(){
        int[] inputArray = new int[]{2,5,6,0,0,1,2};
        int target = 3;
        boolean expectedOutput = false;
        boolean actualOutput = RotatedSortedArray2.search(inputArray,target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithSameElements(){
        int[] inputArray = new int[]{1,1,1,1,1,1,1};
        int target = 2;
        boolean expectedOutput = false;
        boolean actualOutput = RotatedSortedArray2.search(inputArray,target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findElement(){
        int[] inputArray = new int[]{1,1,1,1,1,1,13,1,1};
        int target = 13;
        boolean expectedOutput = true;
        boolean actualOutput = RotatedSortedArray2.search(inputArray,target);
        assertEquals(expectedOutput, actualOutput);
    }
}