package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSubsetsWithDiffTest {
    @Test
    public void testMemoization(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{1, 1, 2, 3};
        int diff = 1;
        int actualOutput = CountSubsetsWithDiff.memoization(inputArray, diff);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int expectedOutput = 2;
        int[] inputArray = new int[]{1, 2, 3, 4};
        int diff = 2;
        int actualOutput = CountSubsetsWithDiff.memoization(inputArray, diff);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{1, 1, 2, 3};
        int diff = 1;
        int actualOutput = CountSubsetsWithDiff.tabulation(inputArray, diff);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int expectedOutput = 2;
        int[] inputArray = new int[]{1, 2, 3, 4};
        int diff = 2;
        int actualOutput = CountSubsetsWithDiff.tabulation(inputArray, diff);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{1, 1, 2, 3};
        int diff = 1;
        int actualOutput = CountSubsetsWithDiff.tabulationSpaceOptimized(inputArray, diff);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        int expectedOutput = 2;
        int[] inputArray = new int[]{1, 2, 3, 4};
        int diff = 2;
        int actualOutput = CountSubsetsWithDiff.tabulationSpaceOptimized(inputArray, diff);
        assertEquals(expectedOutput, actualOutput);
    }
}
