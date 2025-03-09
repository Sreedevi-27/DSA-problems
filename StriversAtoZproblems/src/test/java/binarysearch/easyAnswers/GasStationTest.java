package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
    @Test
    void gasStationTest(){
        int[] inputArray = new int[]{1,2,3,4,5,6,7};
        int k = 6;
        double expectedOutput = 0.5;
        double actualOutput = GasStation.minimiseMaxDistance(inputArray, k);
        assertEquals(expectedOutput, actualOutput);
    }
}