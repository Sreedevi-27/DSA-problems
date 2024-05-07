package strings.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortCharactersByFrequencyTest {
    @Test
    void sortChars(){
        String inputString = "tree";
        String expectedOutput = "eert";
        String actualOutput = SortCharactersByFrequency.frequencySort(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithUpperAndLowercases(){
        String inputString = "Aabb";
        String expectedOutput = "bbAa";
        String actualOutput = SortCharactersByFrequency.frequencySort(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithSameCountOfChars(){
        String inputString = "cccaaa";
        String expectedTitles[] = {"cccaaa","aaaccc"};
        List<String> expectedTitlesList = Arrays.asList(expectedTitles);
        String actualOutput = SortCharactersByFrequency.frequencySort(inputString);
        assertTrue(expectedTitlesList.contains((actualOutput)));
    }
}