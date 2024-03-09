package binarysearch.easyAnswers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AllocateBooksTest {
    @Test
    void allocateBooksTest(){
        ArrayList<Integer> integerArrayList = new ArrayList(Arrays.asList(12,34,67,90));
        int m = 2;
        int expectedOutput = 113;
        int actualOutput = AllocateBooks.findPages(integerArrayList, m);
        assertEquals(expectedOutput, actualOutput);
    }
}