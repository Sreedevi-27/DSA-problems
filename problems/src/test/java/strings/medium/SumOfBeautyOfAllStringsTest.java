package strings.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfBeautyOfAllStringsTest {
    @Test
    void testSumOfBeautyOfAllStrings(){
        String inputString = "aabcb";
        int expectedOutput = 5;
        int actualOutput = SumOfBeautyOfAllStrings.beautySum(inputString);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void findSumOfBeauty(){
        String inputString = "aabcbaa";
        int expectedOutput = 17;
        int actualOutput = SumOfBeautyOfAllStrings.beautySum(inputString);
        assertEquals(expectedOutput, actualOutput);
    }
}