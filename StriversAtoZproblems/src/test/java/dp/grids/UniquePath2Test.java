package dp.grids;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePath2Test {
    @Test
    public  void testMemoizationSolution() {
        int expectedOutput = 2;
        int[][] inputArray = new int[][]{
                {0,0,0},{0,1,0},{0,0,0}
        };
        int actualOutput = UniquePath2.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution1() {
        int expectedOutput = 1;
        int[][] inputArray = new int[][]{
                {0,1},{0,0}
        };
        int actualOutput = UniquePath2.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution() {
        int expectedOutput = 2;
        int[][] inputArray = new int[][]{
                {0,0,0},{0,1,0},{0,0,0}
        };
        int actualOutput = UniquePath2.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution1() {
        int expectedOutput = 1;
        int[][] inputArray = new int[][]{
                {0,1},{0,0}
        };
        int actualOutput = UniquePath2.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution() {
        int expectedOutput = 2;
        int[][] inputArray = new int[][]{
                {0,0,0},{0,1,0},{0,0,0}
        };
        int actualOutput = UniquePath2.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution1() {
        int expectedOutput = 1;
        int[][] inputArray = new int[][]{
                {0,1},{0,0}
        };
        int actualOutput = UniquePath2.tabulationSpaceOptimized(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
