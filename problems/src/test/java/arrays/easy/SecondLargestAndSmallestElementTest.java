package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestAndSmallestElementTest {
    @Test
    void testSecondSmallestAndLargestElement(){
        int[] inputArray = new int[]{1,4,-1,-3,-5,10,7,21,19};
        int[] expectedOutputArray = new int[]{19,-3};
        int[] actualOutputArray = SecondLargestAndSmallestElement.getSecondOrderElements(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}