package basics.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NtoOneTest {
    @Test
    void testRecursion(){
        int input = 10;
        int[] expectedOutput = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] actualOutput = NtoOne.printNos(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithZero(){
        int input = 0;
        int[] expectedOutput = new int[]{};
        int[] actualOutput = NtoOne.printNos(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

}