package arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    @Test
    void testMergeArray(){
        int[] inputArray1 = new int[]{1,2,3,0,0,0};
        int m1 = 3;
        int[] inputArray2 = new int[]{2,5,6};
        int m2 = 3;
        int[] expectedArray = new int[]{1,2,2,3,5,6};
        int[] actualArray = MergeSortedArray.merge(inputArray1, m1, inputArray2, m2);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testWithAnEmptyArray(){
        int[] inputArray1 = new int[]{1};
        int m1 = 1;
        int[] inputArray2 = new int[]{};
        int m2 = 0;
        int[] expectedArray = new int[]{1};
        int[] actualArray = MergeSortedArray.merge(inputArray1, m1, inputArray2, m2);
        assertArrayEquals(expectedArray, actualArray);
    }
}