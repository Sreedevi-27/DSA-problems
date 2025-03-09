package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {
    @Test
    void testLinearSearch(){
        int[] inputArray = new int[]{1,7,2,8,-1,-4,-2,3};
        int expectedOutput = 3;
        int actualOutput = LinearSearch.linearSearch(inputArray, 8);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testLinearSearchElementNotFound(){
        int[] inputArray = new int[]{1,7,2,8,-1,-4,-2,3};
        int expectedOutput = -1;
        int actualOutput = LinearSearch.linearSearch(inputArray, 15);
        assertEquals(expectedOutput, actualOutput);
    }
}