package basics.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    void testReverse(){
        int input = 3789;
        int expectedOutput = 9873;
        int actualOutput = ReverseNumber.reverseNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

}