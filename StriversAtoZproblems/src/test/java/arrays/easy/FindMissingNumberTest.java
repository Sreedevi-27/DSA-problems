package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {
    @Test
    void findMissingNumber(){
        int[] inputArray = new int[]{9,6,4,2,3,5,7,0,1};
        int expectedOutput = 8;
        int actualOutput = FindMissingNumber.missingNumber(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}