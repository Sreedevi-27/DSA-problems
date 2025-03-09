package basics.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumberTest {
    @Test
    void testArmstrongNumber(){
        int input = 1634;
        boolean expectedOutput = true;
        boolean actualOutput = ArmstrongNumber.isArmstrongNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNonArmstrongNumber(){
        int input = 103;
        boolean expectedOutput = false;
        boolean actualOutput = ArmstrongNumber.isArmstrongNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }
}