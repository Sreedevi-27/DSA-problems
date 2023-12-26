package basics.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrintNtimesTest {

    @Test
    void testPrint(){
        int input = 5;
        String expectedOutput = "Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas ";
        String actualOutput = PrintNtimes.printNtimes(input);
        assertEquals(expectedOutput, actualOutput);
    }
}