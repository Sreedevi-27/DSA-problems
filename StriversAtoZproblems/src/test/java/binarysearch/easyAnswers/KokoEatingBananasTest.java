package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {
    @Test
    void findMinimum() {
        int[] inputArray = new int[]{3, 6, 7, 11};
        int hours = 8;
        int expectedOutput = 4;
        int actualOutput = KokoEatingBananas.minEatingSpeed(inputArray, hours);
        assertEquals(expectedOutput, actualOutput);
    }
}