package basics.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneToNTest {
    @Test
    void testRecursion(){
        int input = 10;
        int[] expectedOutput = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] actualOutput = OneToN.printNos(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithZero(){
        int input = 0;
        int[] expectedOutput = new int[]{};
        int[] actualOutput = OneToN.printNos(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}