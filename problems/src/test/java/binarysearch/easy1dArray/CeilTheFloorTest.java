package binarysearch.easy1dArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeilTheFloorTest {
    @Test
    void testCeilTheFloor(){
        int[] inputArray = new int[]{3,4,4,7,8,10};
        int target = 8;
        int[] expectedOutput = new int[]{8,8};
        int[] actualOutput = CeilTheFloor.getFloorAndCeil(inputArray, target);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWhenFloorNotExist(){
        int[] inputArray = new int[]{3,4,4,7,8,10};
        int target = 2;
        int[] expectedOutput = new int[]{-1,3};
        int[] actualOutput = CeilTheFloor.getFloorAndCeil(inputArray, target);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}