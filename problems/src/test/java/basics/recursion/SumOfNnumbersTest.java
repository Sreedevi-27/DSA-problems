package basics.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNnumbersTest {
    @Test
    void testSum(){
        long input = 5;
        long expectedOutput = 15;
        long actualOutput = SumOfNnumbers.sumFirstN(input);
        assertEquals(expectedOutput, actualOutput);
    }
}