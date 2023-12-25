package basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForLoopTest {
    @Test
    void testWithZero(){
        int input = 0;
        int expectedOutput = 0;
        int actualOutput = ForLoop.printNthFibonacciNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithOne(){
        int input = 1;
        int expectedOutput = 1;
        int actualOutput = ForLoop.printNthFibonacciNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithTwo(){
        int input = 1;
        int expectedOutput = 1;
        int actualOutput = ForLoop.printNthFibonacciNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithTwentyFive(){
        int input = 25;
        int expectedOutput = 75025;
        int actualOutput = ForLoop.printNthFibonacciNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }
}