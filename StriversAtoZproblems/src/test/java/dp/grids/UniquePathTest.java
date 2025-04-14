package dp.grids;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathTest {
    @Test
    public void testMemoizationSolution() {
        int expectedOutput = 28;
        int m = 3;
        int n = 7;
        int actualOutput = UniquePath.memoization(m, n);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution1() {
        int expectedOutput = 2496144;
        int m = 14;
        int n = 12;
        int actualOutput = UniquePath.memoization(m, n);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution() {
        int expectedOutput = 28;
        int m = 3;
        int n = 7;
        int actualOutput = UniquePath.tabulation(m, n);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution1() {
        int expectedOutput = 2496144;
        int m = 14;
        int n = 12;
        int actualOutput = UniquePath.tabulation(m, n);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution() {
        int expectedOutput = 28;
        int m = 3;
        int n = 7;
        int actualOutput = UniquePath.tabulationSpaceOptimized(m, n);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution1() {
        int expectedOutput = 2496144;
        int m = 14;
        int n = 12;
        int actualOutput = UniquePath.tabulationSpaceOptimized(m, n);
        assertEquals(expectedOutput, actualOutput);
    }
}
