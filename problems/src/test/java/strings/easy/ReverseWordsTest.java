package strings.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {
    @Test
    void reverseWords(){
        String inputString = "the sky is blue";
        String expectedOutput = "blue is sky the";
        String actualOutput = ReverseWords.reverseWords(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void reverseWordsWithTrailingSpaces(){
        String inputString = "  hello world  ";
        String expectedOutput = "world hello";
        String actualOutput = ReverseWords.reverseWords(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void reverseWordsWithMultipleSpaces(){
        String inputString = "a good   example";
        String expectedOutput = "example good a";
        String actualOutput = ReverseWords.reverseWords(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}