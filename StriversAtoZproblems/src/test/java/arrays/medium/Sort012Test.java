package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sort012Test {
    @Test
    void sortArray(){
        int[] inputArray = new int[]{2,0,2,1,1,0};
        int[] expectedOutputArray = new int[]{0,0,1,1,2,2};
        int[] actualOutputArray = Sort012.sortColors(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void sortArrayWithSingleElement(){
        int[] inputArray = new int[]{2};
        int[] expectedOutputArray = new int[]{2};
        int[] actualOutputArray = Sort012.sortColors(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}