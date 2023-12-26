package basics.math;

import basics.recursion.FactorialRecursion;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisorsTest {

    @Test
    void testAllDivisors(){
        int input = 10;
        List<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(5);
        expectedOutput.add(10);
        List<Integer> actualOutput = Divisors.printDivisors(input);
        assertEquals(expectedOutput, actualOutput);
    }

}