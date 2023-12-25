package basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {
    @Test
    void testWithSmallerNumber(){
        int input1 = 3;
        int input2 = 17;
        String expectedOutput = "smaller";
        String actualOutput = IfElse.compareIfElse(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithGreaterNumber(){
        int input1 = 30;
        int input2 = 8;
        String expectedOutput = "greater";
        String actualOutput = IfElse.compareIfElse(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithSameNumber(){
        int input1 = 15;
        int input2 = 15;
        String expectedOutput = "equal";
        String actualOutput = IfElse.compareIfElse(input1, input2);
        assertEquals(expectedOutput, actualOutput);
    }
}