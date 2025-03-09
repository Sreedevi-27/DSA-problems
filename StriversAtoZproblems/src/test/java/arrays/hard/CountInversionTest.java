package arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountInversionTest {
    @Test
    void findInversionCount(){
        int[] inputArray = new int[]{5,3,2,1,4};
        int expectedOutput = 7;
        int actualOutput = CountInversion.numberOfInversions(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}