package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubsetSumEqualToTargetTest {
    @Test
    public void testMemoization(){
        boolean expectedOutput = true;
        int[] inputArray = new int[]{1, 2, 7, 3};
        int target = 3;
        boolean actualOutput = SubsetSumEqualToTarget.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        boolean expectedOutput = false;
        int[] inputArray = new int[]{2, 3, 5};
        int target = 6;
        boolean actualOutput = SubsetSumEqualToTarget.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        boolean expectedOutput = true;
        int[] inputArray = new int[]{1, 2, 7, 3};
        int target = 3;
        boolean actualOutput = SubsetSumEqualToTarget.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        boolean expectedOutput = false;
        int[] inputArray = new int[]{2, 3, 5};
        int target = 6;
        boolean actualOutput = SubsetSumEqualToTarget.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        boolean expectedOutput = true;
        int[] inputArray = new int[]{1, 2, 7, 3};
        int target = 3;
        boolean actualOutput = SubsetSumEqualToTarget.tabulationSpaceOptimized(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        boolean expectedOutput = false;
        int[] inputArray = new int[]{2, 3, 5};
        int target = 6;
        boolean actualOutput = SubsetSumEqualToTarget.tabulationSpaceOptimized(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}
