package arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingRepeatingNumbersTest {
    @Test
    void finMissingRepeatingNumbers(){
        int[] inputArray = new int[]{1,2,3,2};
        int[] expectedOutputArray = new int[]{2,4};
        int[] actualOutputArray = MissingRepeatingNumbers.findMissingRepeatingNumbers(inputArray);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}