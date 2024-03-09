package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipPackagesTest {
    @Test
    void shipPackageTest(){
        int[] inputArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int expectedOutput = 15;
        int actualOutput = ShipPackages.shipWithinDays(inputArray, days);
        assertEquals(expectedOutput, actualOutput);
    }
}