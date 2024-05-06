package strings.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveOuterParenthesisTest {
    @Test
    void testWithBasicParenthesis(){
        String inputString = "(()())(())";
        String expectedOutput = "()()()";
        String actualOutput = RemoveOuterParenthesis.removeOuterParentheses(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNestedParenthesis(){
        String inputString = "(()())(())(()(()))";
        String expectedOutput = "()()()()(())";
        String actualOutput = RemoveOuterParenthesis.removeOuterParentheses(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithValidParenthesis(){
        String inputString = "()()()";
        String expectedOutput = "";
        String actualOutput = RemoveOuterParenthesis.removeOuterParentheses(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}