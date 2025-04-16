package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {
    @Test
    public void testMemoization(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{1, 2, 5};
        int amount = 11;
        int actualOutput = CoinChange.memoization(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int expectedOutput = -1;
        int[] inputArray = new int[]{2};
        int amount = 3;
        int actualOutput = CoinChange.memoization(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization2(){
        int expectedOutput = 0;
        int[] inputArray = new int[]{1};
        int amount = 0;
        int actualOutput = CoinChange.memoization(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{1, 2, 5};
        int amount = 11;
        int actualOutput = CoinChange.tabulation(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int expectedOutput = -1;
        int[] inputArray = new int[]{2};
        int amount = 3;
        int actualOutput = CoinChange.tabulation(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation2(){
        int expectedOutput = 0;
        int[] inputArray = new int[]{1};
        int amount = 0;
        int actualOutput = CoinChange.tabulation(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        int expectedOutput = 3;
        int[] inputArray = new int[]{1, 2, 5};
        int amount = 11;
        int actualOutput = CoinChange.tabulationSpaceOptimised(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        int expectedOutput = -1;
        int[] inputArray = new int[]{2};
        int amount = 3;
        int actualOutput = CoinChange.tabulationSpaceOptimised(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized2(){
        int expectedOutput = 0;
        int[] inputArray = new int[]{1};
        int amount = 0;
        int actualOutput = CoinChange.tabulationSpaceOptimised(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }
}
