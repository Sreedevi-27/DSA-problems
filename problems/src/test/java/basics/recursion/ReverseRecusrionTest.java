package basics.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseRecusrionTest {
    @Test
    void testReverse(){
        int[] input = new int[]{3, 11, 7, 4, 2, 6, 11};
        int[] expectedOutput = new int[]{11, 6, 2, 4, 7, 11, 3};
        int[] actualOutput = ReverseRecusrion.reverseArray(input.length, input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}