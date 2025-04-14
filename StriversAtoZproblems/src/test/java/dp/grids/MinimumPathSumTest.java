package dp.grids;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathSumTest {
    @Test
    public void testMemoizationSolution() {
        int expectedOutput = 7;
        int[][] inputArray = new int[][]{
                {1,3,1},{1,5,1},{4,2,1}
        };
        int actualOutput = MinimumPathSum.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution1() {
        int expectedOutput = 12;
        int[][] inputArray = new int[][]{
                {1,2,3},{4,5,6}
        };
        int actualOutput = MinimumPathSum.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution() {
        int expectedOutput = 7;
        int[][] inputArray = new int[][]{
                {1,3,1},{1,5,1},{4,2,1}
        };
        int actualOutput = MinimumPathSum.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution1() {
        int expectedOutput = 12;
        int[][] inputArray = new int[][]{
                {1,2,3},{4,5,6}
        };
        int actualOutput = MinimumPathSum.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution() {
        int expectedOutput = 7;
        int[][] inputArray = new int[][]{
                {1,3,1},{1,5,1},{4,2,1}
        };
        int actualOutput = MinimumPathSum.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution1() {
        int expectedOutput = 12;
        int[][] inputArray = new int[][]{
                {1,2,3},{4,5,6}
        };
        int actualOutput = MinimumPathSum.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
