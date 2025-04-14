package dp.TwoD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeeksTrainingTest {
    @Test
    public void testRecursiveSolution() {
        int expectedOutput = 210;
        int[][] inputArray = new int[][]{
                {10, 40, 70}, {20, 50, 80}, {30, 60, 90}
        };
        int actualOutput = GeeksTraining.recursion(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRecursiveSolution1() {
        int expectedOutput = 60;
        int[][] inputArray = new int[][]{
                {20, 10, 10}, {20, 10, 10}, {20, 30, 10}
        };
        int actualOutput = GeeksTraining.recursion(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution() {
        int expectedOutput = 210;
        int[][] inputArray = new int[][]{
                {10, 40, 70}, {20, 50, 80}, {30, 60, 90}
        };
        int actualOutput = GeeksTraining.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution1() {
        int expectedOutput = 60;
        int[][] inputArray = new int[][]{
                {20, 10, 10}, {20, 10, 10}, {20, 30, 10}
        };
        int actualOutput = GeeksTraining.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution() {
        int expectedOutput = 210;
        int[][] inputArray = new int[][]{
                {10, 40, 70}, {20, 50, 80}, {30, 60, 90}
        };
        int actualOutput = GeeksTraining.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution1() {
        int expectedOutput = 60;
        int[][] inputArray = new int[][]{
                {20, 10, 10}, {20, 10, 10}, {20, 30, 10}
        };
        int actualOutput = GeeksTraining.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution() {
        int expectedOutput = 210;
        int[][] inputArray = new int[][]{
                {10, 40, 70}, {20, 50, 80}, {30, 60, 90}
        };
        int actualOutput = GeeksTraining.tabulationSpaceOptimisation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution1() {
        int expectedOutput = 60;
        int[][] inputArray = new int[][]{
                {20, 10, 10}, {20, 10, 10}, {20, 30, 10}
        };
        int actualOutput = GeeksTraining.tabulationSpaceOptimisation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}