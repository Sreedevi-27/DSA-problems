package basics.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputOutputTest {
    @Test
    void testWithUpperCase(){
        Character input = 'A';
        int expectedOutput = 1;
        int actualOutput = InputOutput.printInputOutput(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithLowerCase(){
        Character input = 'z';
        int expectedOutput = 0;
        int actualOutput = InputOutput.printInputOutput(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithNonAlphabet(){
        Character input = '&';
        int expectedOutput = -1;
        int actualOutput = InputOutput.printInputOutput(input);
        assertEquals(expectedOutput, actualOutput);
    }

}