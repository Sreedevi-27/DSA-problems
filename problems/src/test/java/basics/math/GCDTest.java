package basics.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void testGCD(){
        int input1 = 72;
        int input2 = 12;
        int expectedOutput = 12;
        int actualOutput = GCD.gcd(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithZero(){
        int input1 = 5;
        int input2 = 0;
        int expectedOutput = 5;
        int actualOutput = GCD.gcd(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }
}