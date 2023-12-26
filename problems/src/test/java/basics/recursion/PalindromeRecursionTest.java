package basics.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeRecursionTest {
    @Test
    void testPalindrome(){
        String input = "abcdcba";
        boolean expectedOutput = true;
        boolean actualOutput = PalindromeRecursion.isPalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNotPalindrome(){
        String input = "abcda";
        boolean expectedOutput = false;
        boolean actualOutput = PalindromeRecursion.isPalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }
}