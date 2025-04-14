package dp.ThreeD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NinjaAndHisFriendsTest {
    @Test
    public void testRecursiveSolution() {
        int expectedOutput = 37;
        int[][] inputArray = new int[][]{
                {2, 1, 3}, {4, 2, 5}, {1, 6, 2}, {7, 2, 8}
        };
        int actualOutput = NinjaAndHisFriend.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRecursiveSolution1() {
        int expectedOutput = 23;
        int[][] inputArray = new int[][]{
                {1, 2, 3}, {5, 4, 6}, {4, 4, 1}
        };
        int actualOutput = NinjaAndHisFriend.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution() {
        int expectedOutput = 37;
        int[][] inputArray = new int[][]{
                {2, 1, 3}, {4, 2, 5}, {1, 6, 2}, {7, 2, 8}
        };
        int actualOutput = NinjaAndHisFriend.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution1() {
        int expectedOutput = 23;
        int[][] inputArray = new int[][]{
                {1, 2, 3}, {5, 4, 6}, {4, 4, 1}
        };
        int actualOutput = NinjaAndHisFriend.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution() {
        int expectedOutput = 37;
        int[][] inputArray = new int[][]{
                {2, 1, 3}, {4, 2, 5}, {1, 6, 2}, {7, 2, 8}
        };
        int actualOutput = NinjaAndHisFriend.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution1() {
        int expectedOutput = 23;
        int[][] inputArray = new int[][]{
                {1, 2, 3}, {5, 4, 6}, {4, 4, 1}
        };
        int actualOutput = NinjaAndHisFriend.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution() {
        int expectedOutput = 37;
        int[][] inputArray = new int[][]{
                {2, 1, 3}, {4, 2, 5}, {1, 6, 2}, {7, 2, 8}
        };
        int actualOutput = NinjaAndHisFriend.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedOutput, actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution1() {
        int expectedOutput = 23;
        int[][] inputArray = new int[][]{
                {1, 2, 3}, {5, 4, 6}, {4, 4, 1}
        };
        int actualOutput = NinjaAndHisFriend.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}