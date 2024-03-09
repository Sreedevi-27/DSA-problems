package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PaintersPartitionTest {
    @Test
    void paintersPartitionTest(){
        ArrayList<Integer> integerArrayList = new ArrayList(Arrays.asList(10,20,30,40));
        int k = 2;
        int expectedOutput = 60;
        int actualOutput = PaintersPartition.findLargestMinDistance(integerArrayList, k);
        assertEquals(expectedOutput, actualOutput);
    }
}