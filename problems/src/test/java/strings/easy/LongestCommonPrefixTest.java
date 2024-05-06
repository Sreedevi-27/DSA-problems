package strings.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    void findLongestPrefix(){
        String[] inputStringArray = new String[]{"flower","flow","flight"};
        String expectedOutput = "fl";
        String actualOutput = LongestCommonPrefix.longestCommonPrefix(inputStringArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNoPrefix(){
        String[] inputStringArray = new String[]{"dog","racecar","car"};
        String expectedOutput = "";
        String actualOutput = LongestCommonPrefix.longestCommonPrefix(inputStringArray);
        assertEquals(expectedOutput, actualOutput);
    }
}