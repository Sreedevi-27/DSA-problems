package dp.OneD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStarsTest {
    @Test
    public void testRecursiveSolution(){
        int expectedOutput = 3;
        int actualOutput = ClimbingStars.recursion(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRecursiveSolutionLargeOutput(){
        int expectedOutput = 1836311903;
        int actualOutput = ClimbingStars.recursion(45);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution(){
        int expectedOutput = 3;
        int actualOutput = ClimbingStars.memoization(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolutionLargeOutput(){
        int expectedOutput = 1836311903;
        int actualOutput = ClimbingStars.memoization(45);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution(){
        int expectedOutput = 3;
        int actualOutput = ClimbingStars.tabulation(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolutionLargeOutput(){
        int expectedOutput = 1836311903;
        int actualOutput = ClimbingStars.tabulation(45);
        assertEquals(expectedOutput, actualOutput);
    }

}
