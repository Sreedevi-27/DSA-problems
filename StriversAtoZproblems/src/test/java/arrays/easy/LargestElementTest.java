package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementTest {
    @Test
    void findLargestElement(){
        int[] inputArray = new int[]{1,6,7,3,2,10,-2,-1,12};
        int expectedOutput = 12;
        int actualOutput = LargestElement.largestElement(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}