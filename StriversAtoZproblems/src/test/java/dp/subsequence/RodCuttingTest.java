package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RodCuttingTest {
    @Test
    public void testMemoization(){
        int expectedOutput = 40;
        int[] inputArray = new int[]{5, 5, 8, 9, 10, 17, 17, 20};
        int target = inputArray.length;
        int actualOutput = RodCutting.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int expectedOutput = 10;
        int[] inputArray = new int[]{1, 5, 8, 9};
        int target = inputArray.length;
        int actualOutput = RodCutting.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization2(){
        int expectedOutput = 6;
        int[] inputArray = new int[]{6};
        int target = inputArray.length;
        int actualOutput = RodCutting.memoization(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int expectedOutput = 40;
        int[] inputArray = new int[]{5, 5, 8, 9, 10, 17, 17, 20};
        int target = inputArray.length;
        int actualOutput = RodCutting.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int expectedOutput = 10;
        int[] inputArray = new int[]{1, 5, 8, 9};
        int target = inputArray.length;
        int actualOutput = RodCutting.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation2(){
        int expectedOutput = 6;
        int[] inputArray = new int[]{6};
        int target = inputArray.length;
        int actualOutput = RodCutting.tabulation(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised(){
        int expectedOutput = 40;
        int[] inputArray = new int[]{5, 5, 8, 9, 10, 17, 17, 20};
        int target = inputArray.length;
        int actualOutput = RodCutting.tabulationSpaceOptimised(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised1(){
        int expectedOutput = 10;
        int[] inputArray = new int[]{1, 5, 8, 9};
        int target = inputArray.length;
        int actualOutput = RodCutting.tabulationSpaceOptimised(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised2(){
        int expectedOutput = 6;
        int[] inputArray = new int[]{6};
        int target = inputArray.length;
        int actualOutput = RodCutting.tabulationSpaceOptimised(inputArray, target);
        assertEquals(expectedOutput, actualOutput);
    }
}

