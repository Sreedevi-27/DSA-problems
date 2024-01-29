package arrays.hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {
    @Test
    void testFourSum(){
        int[] inputArray = new int[]{1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> expectedOutput = Arrays.asList(Arrays.asList(-2,-1,1,2),Arrays.asList(-2,0,0,2),Arrays.asList(-1,0,0,1));
        Integer[][] expectedOutputArray  = expectedOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        List<List<Integer>> actualOutput = FourSum.fourSum(inputArray, target);
        Integer[][] actualOutputArray  = actualOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void noPossibleSum(){
        int[] inputArray = new int[]{-8,-2,2,7,9,2,0,-4};
        int target = 15;
        List<List<Integer>> expectedOutput = Arrays.asList();
        Integer[][] expectedOutputArray  = expectedOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        List<List<Integer>> actualOutput = FourSum.fourSum(inputArray, target);
        Integer[][] actualOutputArray  = actualOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}