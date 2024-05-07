package strings.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {
    @Test
    void convertStringToInteger(){
        String inputString = "42";
        int expectedOutput = 42;
        int actualOutput = StringToInteger.myAtoi(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNegativeNumber(){
        String inputString = "-042";
        int expectedOutput = -42;
        int actualOutput = StringToInteger.myAtoi(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithSpecialCharacters(){
        String inputString = "0-1";
        int expectedOutput = 0;
        int actualOutput = StringToInteger.myAtoi(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithAlphaNumeric(){
        String inputString = "1337c0d3";
        int expectedOutput = 1337;
        int actualOutput = StringToInteger.myAtoi(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}