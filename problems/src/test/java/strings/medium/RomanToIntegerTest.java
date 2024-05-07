package strings.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @Test
    void convertRomanToInteger(){
        String inputString = "III";
        int expectedOutput = 3;
        int actualOutput = RomanToInteger.romanToInt(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithTrickyNumbers(){
        String inputString = "MCMXCIV";
        int expectedOutput = 1994;
        int actualOutput = RomanToInteger.romanToInt(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithLargestNumbers(){
        String inputString = "MMMCMXCIX";
        int expectedOutput = 3999;
        int actualOutput = RomanToInteger.romanToInt(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}