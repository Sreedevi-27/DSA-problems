package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {
    @Test
    void findSquareRoot(){
        long input = 7;
        int expectedOutput = 2;
        int actualOutput = SquareRoot.sqrtN(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithPerfectSquare(){
        long input = 100;
        int expectedOutput = 10;
        int actualOutput = SquareRoot.sqrtN(input);
        assertEquals(expectedOutput, actualOutput);
    }
}