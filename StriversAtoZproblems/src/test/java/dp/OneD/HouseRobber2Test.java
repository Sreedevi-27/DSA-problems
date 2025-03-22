package dp.OneD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobber2Test {
    @Test
    public void testMemoization(){
        int[] inputArray = new int[]{2,1,1,2};
        int expectedOutput = 3;
        int actualOutput = HouseRobber2.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int[] inputArray = new int[]{1};
        int expectedOutput = 1;
        int actualOutput = HouseRobber2.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int[] inputArray = new int[]{2,1,1,2};
        int expectedOutput = 3;
        int actualOutput = HouseRobber2.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int[] inputArray = new int[]{2};
        int expectedOutput = 2;
        int actualOutput = HouseRobber2.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised(){
        int[] inputArray = new int[]{2,7,9,3,1};
        int expectedOutput = 11;
        int actualOutput = HouseRobber2.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised1(){
        int[] inputArray = new int[]{1,2};
        int expectedOutput = 2;
        int actualOutput = HouseRobber2.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
