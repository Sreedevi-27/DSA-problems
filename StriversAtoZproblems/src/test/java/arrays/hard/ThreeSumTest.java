package arrays.hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void testThreeSum(){
        int[] inputArray = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> expectedOutput = Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1));
        Integer[][] expectedOutputArray  = expectedOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        List<List<Integer>> actualOutput = ThreeSum.threeSum(inputArray);
        Integer[][] actualOutputArray  = actualOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void noPossibleTriplet(){
        int[] inputArray = new int[]{0,1,1};
        List<List<Integer>> expectedOutput = Arrays.asList();
        Integer[][] expectedOutputArray  = expectedOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        List<List<Integer>> actualOutput = ThreeSum.threeSum(inputArray);
        Integer[][] actualOutputArray  = actualOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void withZerosInArray(){
        int[] inputArray = new int[]{0,0,0};
        List<List<Integer>> expectedOutput = Arrays.asList(Arrays.asList(0,0,0));
        Integer[][] expectedOutputArray  = expectedOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        List<List<Integer>> actualOutput = ThreeSum.threeSum(inputArray);
        Integer[][] actualOutputArray  = actualOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}