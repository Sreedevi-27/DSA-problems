package basics.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountFrequenciesTest {
    @Test
    void testFrequencies(){
        int range = 6;
        int[] inputArray = new int[]{1,3,4,3,4,1};
        int[] expectedOutput = new int[]{2,0,2,2,0,0};
        int[] actualOutput = CountFrequencies.countFrequency(range, inputArray.length, inputArray);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}