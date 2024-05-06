package strings.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    @Test
    void testWithValidAnagramStrings(){
        String inputString1 = "anagram";
        String inputString2 = "nagaram";
        boolean expectedOutput = true;
        boolean actualOutput = ValidAnagram.isAnagram(inputString1, inputString2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNonValidAnagramStrings(){
        String inputString1 = "rat";
        String inputString2 = "car";
        boolean expectedOutput = false;
        boolean actualOutput = ValidAnagram.isAnagram(inputString1, inputString2);
        assertEquals(expectedOutput, actualOutput);
    }
}