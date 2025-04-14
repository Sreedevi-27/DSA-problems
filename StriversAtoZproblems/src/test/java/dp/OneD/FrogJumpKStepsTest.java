package dp.OneD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJumpKStepsTest {
    @Test
    public void testMemoization(){
        int expectedOutput = 40;
        int[] inputArray = new int[]{10,40,30,10};
        int actualOutput = FrogJumpKSteps.memoization(2, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int expectedOutput = 50;
        int[] inputArray = new int[]{10,40,50,20,60};
        int actualOutput = FrogJumpKSteps.memoization(3, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int expectedOutput = 40;
        int[] inputArray = new int[]{10,40,30,10};
        int actualOutput = FrogJumpKSteps.tabulation(2, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int expectedOutput = 50;
        int[] inputArray = new int[]{10,40,50,20,60};
        int actualOutput = FrogJumpKSteps.tabulation(3, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        int expectedOutput = 40;
        int[] inputArray = new int[]{10,40,30,10};
        int actualOutput = FrogJumpKSteps.tabulationSpaceOptimised(2, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        int expectedOutput = 50;
        int[] inputArray = new int[]{10,40,50,20,60};
        int actualOutput = FrogJumpKSteps.tabulationSpaceOptimised(2, inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
