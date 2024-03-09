package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mBouquetsTest {
    @Test
    void findMBouquets(){
        int[] inputArray = new int[]{7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        int expectedOutput = 12;
        int actualOutput = mBouquets.minDays(inputArray, m, k);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void impossibleBouquets(){
        int[] inputArray = new int[]{1,10,3,10,2};
        int m = 3;
        int k = 2;
        int expectedOutput = -1;
        int actualOutput = mBouquets.minDays(inputArray, m, k);
        assertEquals(expectedOutput, actualOutput);
    }
}