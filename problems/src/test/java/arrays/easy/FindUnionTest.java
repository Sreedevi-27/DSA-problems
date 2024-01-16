package arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindUnionTest {
    @Test
    void testUnion() {
        int[] inputList1 = new int[]{1,2,3,4,6};
        int[] inputList2= new int[]{2,3,5};
        List<Integer> expectedOutputList = Arrays.asList(1,2,3,4,5,6);
        List<Integer> actualOutputList = FindUnion.sortedArray(inputList1, inputList2);
        assertEquals(expectedOutputList, actualOutputList);
    }

    @Test
    void testUnionWithNoCommonElement() {
        int[] inputList1 = new int[]{1,2,3,4,6};
        int[] inputList2= new int[]{7,8};
        List<Integer> expectedOutputList = Arrays.asList(1,2,3,4,6,7,8);
        List<Integer> actualOutputList = FindUnion.sortedArray(inputList1, inputList2);
        assertEquals(expectedOutputList, actualOutputList);
    }

    @Test
    void testUnionWithAllCommonElement() {
        int[] inputList1 = new int[]{1,2,3,4,6};
        int[] inputList2= new int[]{1,2,3,4,6};
        List<Integer> expectedOutputList = Arrays.asList(1,2,3,4,6);
        List<Integer> actualOutputList = FindUnion.sortedArray(inputList1, inputList2);
        assertEquals(expectedOutputList, actualOutputList);
    }
}
