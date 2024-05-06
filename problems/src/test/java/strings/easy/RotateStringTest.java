package strings.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateStringTest {
    @Test
    void testWithRotatedString(){
        String inputString = "abcde";
        String inputGoalString = "cdeab";
        boolean expectedOutput = true;
        boolean actualOutput = RotateString.rotateString(inputString, inputGoalString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNonRotatedString(){
        String inputString = "abcde";
        String inputGoalString = "abced";
        boolean expectedOutput = false;
        boolean actualOutput = RotateString.rotateString(inputString, inputGoalString);
        assertEquals(expectedOutput, actualOutput);
    }
}