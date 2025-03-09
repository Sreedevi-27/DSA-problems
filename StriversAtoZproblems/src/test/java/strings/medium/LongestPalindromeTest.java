package strings.medium;

import org.junit.jupiter.api.Test;
import strings.easy.ReverseWords;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {
    @Test
    void findLongestPalindrome(){
        String inputString = "babad";
        String expectedOutput = "bab";
        String actualOutput = LongestPalindrome.longestPalindrome(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNonPalindromeWord(){
        String inputString = "sg";
        String expectedOutput = "s";
        String actualOutput = LongestPalindrome.longestPalindrome(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}