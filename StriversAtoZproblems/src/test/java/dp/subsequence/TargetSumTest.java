package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TargetSumTest {
    @Test
    public void testMemoization(){
        int expectedOutput = 5;
        int[] inputArray = new int[]{1,1,1,1,1};
        int target = 3;
        int actualOutput = TargetSum.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int expectedOutput = 1;
        int[] inputArray = new int[]{1};
        int target = 1;
        int actualOutput = TargetSum.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int expectedOutput = 5;
        int[] inputArray = new int[]{1,1,1,1,1};
        int target = 3;
        int actualOutput = TargetSum.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int expectedOutput = 1;
        int[] inputArray = new int[]{1};
        int target = 1;
        int actualOutput = TargetSum.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        int expectedOutput = 5;
        int[] inputArray = new int[]{1,1,1,1,1};
        int target = 3;
        int actualOutput = TargetSum.tabulationSpaceOptimized(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        int expectedOutput = 1;
        int[] inputArray = new int[]{1};
        int target = 1;
        int actualOutput = TargetSum.tabulationSpaceOptimized(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}
