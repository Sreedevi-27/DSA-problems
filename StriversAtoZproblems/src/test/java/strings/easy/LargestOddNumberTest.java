package strings.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestOddNumberTest {
    @Test
    void findLargestOddNumber(){
        String inputString = "52";
        String expectedOutput = "5";
        String actualOutput = LargestOddNumber.largestOddNumber(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithEvenDigits(){
        String inputString = "68204";
        String expectedOutput = "";
        String actualOutput = LargestOddNumber.largestOddNumber(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithLargeDigits(){
        String inputString = "35427";
        String expectedOutput = "35427";
        String actualOutput = LargestOddNumber.largestOddNumber(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}