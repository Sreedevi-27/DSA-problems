package dp.subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionArrayMinDifferenceTest {
    @Test
    public void testMinDifference(){
        int expectedOutput = 1;
        int[] inputArray = new int[]{1, 7, 14, 5};
        int actualOutput = PartitionArrayMinDifference.minDifference(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMinDifference1(){
        int expectedOutput = 0;
        int[] inputArray = new int[]{3, 1, 6, 2, 2};
        int actualOutput = PartitionArrayMinDifference.minDifference(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}
