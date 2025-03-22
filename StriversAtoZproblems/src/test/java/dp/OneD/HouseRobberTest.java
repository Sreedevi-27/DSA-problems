
package dp.OneD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberTest {
    @Test
    public void testMemoization(){
        int[] inputArray = new int[]{1,2,3,1};
        int expectedOutput = 4;
        int actualOutput = HouseRobber.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoization1(){
        int[] inputArray = new int[]{2,7,9,3,1};
        int expectedOutput = 12;
        int actualOutput = HouseRobber.memoization(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation(){
        int[] inputArray = new int[]{1,2,3,1};
        int expectedOutput = 4;
        int actualOutput = HouseRobber.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulation1(){
        int[] inputArray = new int[]{1,2};
        int expectedOutput = 2;
        int actualOutput = HouseRobber.tabulation(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised(){
        int[] inputArray = new int[]{1,2,3,1};
        int expectedOutput = 4;
        int actualOutput = HouseRobber.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimised1(){
        int[] inputArray = new int[]{1,2};
        int expectedOutput = 2;
        int actualOutput = HouseRobber.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
