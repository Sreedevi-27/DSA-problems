package basics.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testPalindrome(){
        int input = 8934398;
        boolean expectedOutput = true;
        boolean actualOutput = Palindrome.checkPalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNotPalindrome(){
        int input = 89123;
        boolean expectedOutput = false;
        boolean actualOutput = Palindrome.checkPalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }
}