package strings.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNestingDepthOfParenthesisTest {
    @Test
    void findMaxNesting(){
        String inputString = "(1+(2*3)+((8)/4))+1";
        int expectedOutput = 3;
        int actualOutput = MaximumNestingDepthOfParenthesis.maxDepth(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findMaxNestingWithOnlyParenthesis(){
        String inputString = "()(())((()()))";
        int expectedOutput = 3;
        int actualOutput = MaximumNestingDepthOfParenthesis.maxDepth(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}