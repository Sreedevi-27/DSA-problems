package basics.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursionTest {
    @Test
    void printFibonacci(){
        int input = 5;
        int[] expectedOutput = new int[]{0,1,1,2,3};
        int[] actualOutput = FibonacciRecursion.generateFibonacciNumbers(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}