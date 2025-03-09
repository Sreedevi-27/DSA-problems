package basics.recursion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FactorialRecursionTest {
    @Test
    void testFactorial(){
        long input = 7;
        List<Long> expectedOutput = new ArrayList<>();
        expectedOutput.add(1L);
        expectedOutput.add(2L);
        expectedOutput.add(6L);
        List<Long> actualOutput = FactorialRecursion.factorialNumbers(7);
        assertEquals(expectedOutput, actualOutput);
    }
}