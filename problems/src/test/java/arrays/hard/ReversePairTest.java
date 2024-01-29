package arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePairTest {
    @Test
    void findReverseCount(){
        int[] inputArray = new int[]{1,3,2,3,1};
        int expectedOutput = 2;
        int actualOutput = ReversePair.reversePairs(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}