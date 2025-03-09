package dp.introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacciTopDown(){
        long expectedOutput = 55;
        long actualOutput = Fibonacci.topDown(10);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFibonacciTopDownLargeNumber(){
        long expectedOutput =  701408733;
        long actualOutput = Fibonacci.topDown(44);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFibonacciBottomUp(){
        long expectedOutput = 55;
        long actualOutput = Fibonacci.topDown(10);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFibonacciBottomUpLargeNumber(){
        long expectedOutput =  701408733;
        long actualOutput = Fibonacci.topDown(44);
        assertEquals(expectedOutput, actualOutput);
    }

}
