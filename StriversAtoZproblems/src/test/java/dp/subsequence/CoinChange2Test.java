package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChange2Test {
    @Test
    public void testMemoization(){
        int expectedOutput = 4;
        int[] inputArray = new int[]{1, 2, 5};
        int amount = 5;
        int actualOutput = CoinChange2.memoization(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int expectedOutput = 0;
        int[] inputArray = new int[]{2};
        int amount = 3;
        int actualOutput = CoinChange2.memoization(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization2(){
        int expectedOutput = 1;
        int[] inputArray = new int[]{10};
        int amount = 10;
        int actualOutput = CoinChange2.memoization(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int expectedOutput = 4;
        int[] inputArray = new int[]{1, 2, 5};
        int amount = 5;
        int actualOutput = CoinChange2.tabulation(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int expectedOutput = 0;
        int[] inputArray = new int[]{2};
        int amount = 3;
        int actualOutput = CoinChange2.tabulation(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation2(){
        int expectedOutput = 1;
        int[] inputArray = new int[]{10};
        int amount = 10;
        int actualOutput = CoinChange2.tabulation(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized(){
        int expectedOutput = 4;
        int[] inputArray = new int[]{1, 2, 5};
        int amount = 5;
        int actualOutput = CoinChange2.tabulationSpaceOptimized(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized1(){
        int expectedOutput = 0;
        int[] inputArray = new int[]{2};
        int amount = 3;
        int actualOutput = CoinChange2.tabulationSpaceOptimized(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimized2(){
        int expectedOutput = 1;
        int[] inputArray = new int[]{10};
        int amount = 10;
        int actualOutput = CoinChange2.tabulationSpaceOptimized(inputArray, amount);
        assertEquals(expectedOutput, actualOutput);
    }
}
