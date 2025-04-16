package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSubsetsWithTargetTest{
    @Test
    public void testMemoization(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{2, 3, 5, 16, 8, 10};
        int target = 10;
        int actualOutput = CountSubsetsWithTarget.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int expectedOutput = 6;
        int[] inputArray = new int[]{2, 2, 2, 2};
        int target = 4;
        int actualOutput = CountSubsetsWithTarget.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{2, 3, 5, 16, 8, 10};
        int target = 10;
        int actualOutput = CountSubsetsWithTarget.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int expectedOutput = 6;
        int[] inputArray = new int[]{2, 2, 2, 2};
        int target = 4;
        int actualOutput = CountSubsetsWithTarget.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{2, 3, 5, 16, 8, 10};
        int target = 10;
        int actualOutput = CountSubsetsWithTarget.tabulationSpaceOptimized(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        int expectedOutput = 6;
        int[] inputArray = new int[]{2, 2, 2, 2};
        int target = 4;
        int actualOutput = CountSubsetsWithTarget.tabulationSpaceOptimized(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}
