package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Knapsack01Test {
    @Test
    public void testMemoization() {
        int expectedOutput = 220;
        int[] valueArray = new int[]{60, 100, 120};
        int[]  weightArray = new int[]{10, 20, 30};
        int weight = 50;
        int actualOutput = Knapsack01.memoization(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1() {
        int expectedOutput = 90;
        int[] valueArray = new int[]{10, 40, 30, 50};
        int[]  weightArray = new int[]{5, 4, 6, 3};
        int weight = 10;
        int actualOutput = Knapsack01.memoization(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation() {
        int expectedOutput = 220;
        int[] valueArray = new int[]{60, 100, 120};
        int[]  weightArray = new int[]{10, 20, 30};
        int weight = 50;
        int actualOutput = Knapsack01.tabulation(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1() {
        int expectedOutput = 90;
        int[] valueArray = new int[]{10, 40, 30, 50};
        int[]  weightArray = new int[]{5, 4, 6, 3};
        int weight = 10;
        int actualOutput = Knapsack01.tabulation(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised() {
        int expectedOutput = 220;
        int[] valueArray = new int[]{60, 100, 120};
        int[]  weightArray = new int[]{10, 20, 30};
        int weight = 50;
        int actualOutput = Knapsack01.tabulationSpaceOptimised(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised1() {
        int expectedOutput = 90;
        int[] valueArray = new int[]{10, 40, 30, 50};
        int[]  weightArray = new int[]{5, 4, 6, 3};
        int weight = 10;
        int actualOutput = Knapsack01.tabulationSpaceOptimised(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }
}
