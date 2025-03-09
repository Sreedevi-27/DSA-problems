package arrays.hard;

import arrays.hard.MajorityElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    @Test
    void findMajority(){
        int[] inputArray = new int[]{3,2,3};
        List<Integer> expectedOutput = Arrays.asList(new Integer[]{3});
        List<Integer> actualOutput = MajorityElement.majorityElement(inputArray);
        Integer[] expectedOutputArray = expectedOutput.stream().toArray(Integer[] ::new);
        Integer[] actualOutputArray = actualOutput.stream().toArray(Integer[] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void findMajorityInUniqueElementArray(){
        int[] inputArray = new int[]{1,2};
        List<Integer> expectedOutput = Arrays.asList(new Integer[]{1,2});
        List<Integer> actualOutput = MajorityElement.majorityElement(inputArray);
        Integer[] expectedOutputArray = expectedOutput.stream().toArray(Integer[] ::new);
        Integer[] actualOutputArray = actualOutput.stream().toArray(Integer[] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}