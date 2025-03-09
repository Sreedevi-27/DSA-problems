package strings.medium;

import org.junit.jupiter.api.Test;
import strings.easy.ReverseWords;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {
    @Test
    void reverseWords(){
        String inputString = "the sky is blue";
        String expectedOutput = "blue is sky the";
        String actualOutput = ReverseWordsInAString.reverseWords(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void reverseWordsWithTrailingSpaces(){
        String inputString = "  hello world  ";
        String expectedOutput = "world hello";
        String actualOutput = ReverseWordsInAString.reverseWords(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void reverseWordsWithMultipleSpaces(){
        String inputString = "a good   example";
        String expectedOutput = "example good a";
        String actualOutput = ReverseWordsInAString.reverseWords(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}