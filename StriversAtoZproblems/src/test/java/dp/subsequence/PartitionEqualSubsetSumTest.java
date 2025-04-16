package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionEqualSubsetSumTest {
    @Test
    public void testMemoization(){
        boolean expectedOutput = true;
        int[] inputArray = new int[]{1,5,11,5};
        boolean actualOutput = PartitionEqualSubsetSum.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        boolean expectedOutput = false;
        int[] inputArray = new int[]{1,2,3,5};
        boolean actualOutput = PartitionEqualSubsetSum.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        boolean expectedOutput = true;
        int[] inputArray = new int[]{1,5,11,5};
        boolean actualOutput = PartitionEqualSubsetSum.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        boolean expectedOutput = false;
        int[] inputArray = new int[]{1,2,3,5};
        boolean actualOutput = PartitionEqualSubsetSum.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        boolean expectedOutput = true;
        int[] inputArray = new int[]{1,5,11,5};
        boolean actualOutput = PartitionEqualSubsetSum.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        boolean expectedOutput = false;
        int[] inputArray = new int[]{1,2,3,5};
        boolean actualOutput = PartitionEqualSubsetSum.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
