package basics.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitTest {
    @Test
    void testWithDivisbleDigits(){
        int input = 336;
        int expectedOutput = 3;
        int actualOutput = CountDigit.countDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNonDivisibleDigits(){
        int input = 337;
        int expectedOutput = 0;
        int actualOutput = CountDigit.countDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }
}