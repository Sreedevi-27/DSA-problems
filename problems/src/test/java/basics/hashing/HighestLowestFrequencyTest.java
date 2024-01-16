package basics.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestLowestFrequencyTest {
    @Test
    void testWithDifferentFrequencies(){
        int[] inputArray = new int[]{2,8,5,2,8,5,1,5};
        int[] expectedOutputArray = new int[]{5,1};
        int[] actualOutputArray = HighestLowestFrequency.getFrequencies(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }

    @Test
    void testWithSameFrequencies(){
        int[] inputArray = new int[]{11,13,3,14,17,3,7,9,1,11,9,15,5,2,2,3};
        int[] expectedOutputArray = new int[]{3,1};
        int[] actualOutputArray = HighestLowestFrequency.getFrequencies(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}