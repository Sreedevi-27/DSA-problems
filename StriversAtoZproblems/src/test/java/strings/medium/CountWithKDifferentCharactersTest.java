package strings.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountWithKDifferentCharactersTest {
    @Test
    void countKDiffCharacter(){
        String inputString = "aacfssa";
        int k = 3;
        int expectedOutput = 5;
        int actualOutput = CountWithKDifferentCharacters.countSubStrings(inputString, k);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithSimpleInput(){
        String inputString = "qffds";
        int k = 4;
        int expectedOutput = 1;
        int actualOutput = CountWithKDifferentCharacters.countSubStrings(inputString, k);
        assertEquals(expectedOutput, actualOutput);
    }
}