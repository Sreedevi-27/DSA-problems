package dp.grids;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumFallingPathSumTest {
    @Test
    public void testMemoizationSolution() {
        int expectedOutput = 13;
        int[][] inputArray = new int[][]{
                {2,1,3},{6,5,4},{7,8,9}
        };
        int actualOutput = MinimumFallingPathSum.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution1() {
        int expectedOutput = -59;
        int[][] inputArray = new int[][]{
                {-19,57},{-40, -5}
        };
        int actualOutput = MinimumFallingPathSum.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution() {
        int expectedOutput = 13;
        int[][] inputArray = new int[][]{
                {2,1,3},{6,5,4},{7,8,9}
        };
        int actualOutput = MinimumFallingPathSum.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution1() {
        int expectedOutput = -59;
        int[][] inputArray = new int[][]{
                {-19,57},{-40, -5}
        };
        int actualOutput = MinimumFallingPathSum.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution() {
        int expectedOutput = 13;
        int[][] inputArray = new int[][]{
                {2,1,3},{6,5,4},{7,8,9}
        };
        int actualOutput = MinimumFallingPathSum.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution1() {
        int expectedOutput = -59;
        int[][] inputArray = new int[][]{
                {-19,57},{-40, -5}
        };
        int actualOutput = MinimumFallingPathSum.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
