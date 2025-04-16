package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnboundedKnapsackTest {
    @Test
    public void testMemoization() {
        int expectedOutput = 360;
        int[] valueArray = new int[]{60, 100, 120};
        int[]  weightArray = new int[]{10, 20, 30};
        int weight = 60;
        int actualOutput = UnboundedKnapsack.memoization(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1() {
        int expectedOutput = 110;
        int[] valueArray = new int[]{10, 40, 50, 70};
        int[]  weightArray = new int[]{1, 3, 4, 5};
        int weight = 8;
        int actualOutput = UnboundedKnapsack.memoization(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation() {
        int expectedOutput = 360;
        int[] valueArray = new int[]{60, 100, 120};
        int[]  weightArray = new int[]{10, 20, 30};
        int weight = 60;
        int actualOutput = UnboundedKnapsack.tabulation(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1() {
        int expectedOutput = 110;
        int[] valueArray = new int[]{10, 40, 50, 70};
        int[]  weightArray = new int[]{1, 3, 4, 5};
        int weight = 8;
        int actualOutput = UnboundedKnapsack.tabulation(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised() {
        int expectedOutput = 360;
        int[] valueArray = new int[]{60, 100, 120};
        int[]  weightArray = new int[]{10, 20, 30};
        int weight = 60;
        int actualOutput = UnboundedKnapsack.tabulationSpaceOptimised(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised1() {
        int expectedOutput = 110;
        int[] valueArray = new int[]{10, 40, 50, 70};
        int[]  weightArray = new int[]{1, 3, 4, 5};
        int weight = 8;
        int actualOutput = UnboundedKnapsack.tabulationSpaceOptimised(valueArray, weightArray, weight);
        assertEquals(expectedOutput, actualOutput);
    }
}
