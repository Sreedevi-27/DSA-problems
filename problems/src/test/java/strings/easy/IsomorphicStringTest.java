package strings.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringTest {
    @Test
    void testWithIsomorphicString(){
        String inputString1 = "egg";
        String inputString2 = "add";
        boolean expectedOutput = true;
        boolean actualOutput = IsomorphicString.isIsomorphic(inputString1, inputString2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNonIsomorphicString(){
        String inputString1 = "foo";
        String inputString2 = "bar";
        boolean expectedOutput = false;
        boolean actualOutput = IsomorphicString.isIsomorphic(inputString1, inputString2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithAnotherIsomorphicString(){
        String inputString1 = "paper";
        String inputString2 = "title";
        boolean expectedOutput = true;
        boolean actualOutput = IsomorphicString.isIsomorphic(inputString1, inputString2);
        assertEquals(expectedOutput, actualOutput);
    }
}