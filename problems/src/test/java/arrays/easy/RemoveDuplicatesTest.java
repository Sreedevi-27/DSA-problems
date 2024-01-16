package arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void removeDuplicates(){
        int[] inputArray = new int[]{1,1,2,3,4,4,5,6,6,7};
        int expectedOutput = 7;
        int actualOutput = RemoveDuplicates.removeDuplicates(inputArray);
        assertEquals(expectedOutput, actualOutput);
        for(int i=0; i<expectedOutput; i++){
            assertEquals(i+1, inputArray[i]);
        }
    }
}