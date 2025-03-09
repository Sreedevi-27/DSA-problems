package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RearrangeElementsTest {
    @Test
    void testRearrange(){
        int[] inputArray = new int[]{3,1,-2,-5,2,-4};
        int[] expectedOutput = new int[]{3,-2,1,-5,2,-4};
        int[] actualOutput = RearrangeElements.rearrangeArray(inputArray);
        assertArrayEquals(expectedOutput,actualOutput);
    }

}