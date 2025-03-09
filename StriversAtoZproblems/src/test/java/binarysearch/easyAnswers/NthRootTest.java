package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthRootTest {
    @Test
    void testWithPerfectNumber(){
        int input = 32768;
        int root = 5;
        int expectedOutput = 8;
        int actualOutput = NthRoot.findNthRoot(root, input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNonPerfectNumber(){
        int input = 69;
        int root = 4;
        int expectedOutput = -1;
        int actualOutput = NthRoot.findNthRoot(root, input);
        assertEquals(expectedOutput, actualOutput);
    }
}