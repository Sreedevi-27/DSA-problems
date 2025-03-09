package basics.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhileLoopTest {
    @Test
    void testWhileLoop(){
        int input = 123456;
        int[] expectedOutput = new int[]{12,9};
        int[] actualOutput = WhileLoop.sumOfOddAndEvenDigits(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}