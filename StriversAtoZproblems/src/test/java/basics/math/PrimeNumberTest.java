package basics.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    void testPrimeNumber(){
        int input = 13;
        boolean expectedOutput = true;
        boolean actualOutput = PrimeNumber.isPrime(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNonPrimeNumber(){
        int input = 86;
        boolean expectedOutput = false;
        boolean actualOutput = PrimeNumber.isPrime(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithOne(){
        int input = 1;
        boolean expectedOutput = false;
        boolean actualOutput = PrimeNumber.isPrime(input);
        assertEquals(expectedOutput, actualOutput);
    }
}