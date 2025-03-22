package dp.OneD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJumpTest {
    @Test
    public void findMinJump_Memoization(){
        int[] inputArray = new int[]{2, 1, 3, 5, 4};
        int expectedResult = 2;
        int actualResult = FrogJump.memoization(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMinJump_Memoization1(){
        int[] inputArray = new int[]{7, 5, 1, 2, 6};
        int expectedResult = 9;
        int actualResult = FrogJump.memoization(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMinJump_Tabulation(){
        int[] inputArray = new int[]{2, 1, 3, 5, 4};
        int expectedResult = 2;
        int actualResult = FrogJump.tabulation(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMinJump_Tabulation1(){
        int[] inputArray = new int[]{7, 5, 1, 2, 6};
        int expectedResult = 9;
        int actualResult = FrogJump.tabulation(inputArray);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void findMinJump_TabulationSpaceOptimised(){
        int[] inputArray = new int[]{2, 1, 3, 5, 4};
        int expectedResult = 2;
        int actualResult = FrogJump.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMinJump_TabulationSpaceOptimised1(){
        int[] inputArray = new int[]{7, 5, 1, 2, 6};
        int expectedResult = 9;
        int actualResult = FrogJump.tabulationSpaceOptimised(inputArray);
        assertEquals(expectedResult, actualResult);
    }
}
