package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    @Test
    void findMajority(){
        int[] inputArray = new int[]{2,2,1,1,1,2,2};
        int expectedArray = 2;
        int actualArray = MajorityElement.majorityElement(inputArray);
        assertEquals(expectedArray, actualArray);
    }
}