package arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeaderInArrayTest {
    @Test
    void findLeaders(){
        int[] inputArray = new int[]{1,2,3,2};
        List<Integer> expectedOutput = Arrays.asList(new Integer[]{2, 3});
        List<Integer> actualOutput = LeaderInArray.superiorElements(inputArray);
        Integer[] expectedOutputArray = expectedOutput.stream().toArray(Integer[] ::new);
        Integer[] actualOutputArray = actualOutput.stream().toArray(Integer[] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}