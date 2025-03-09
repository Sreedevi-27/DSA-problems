package basics.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchCaseTest {
    @Test
    void testWithCircle(){
        int choice = 1;
        double[] inputArray = new double[]{3};
        double expectedOutput = 28.274333882308138;
        double actualOutput = SwitchCase.areaSwitchCase(choice, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithRectangle(){
        int choice = 2;
        double[] inputArray = new double[]{3,4};
        double expectedOutput = 12;
        double actualOutput = SwitchCase.areaSwitchCase(choice, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithInvalidInput(){
        int choice = 3;
        double[] inputArray = new double[]{3,4};
        double expectedOutput = -1;
        double actualOutput = SwitchCase.areaSwitchCase(choice, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

}