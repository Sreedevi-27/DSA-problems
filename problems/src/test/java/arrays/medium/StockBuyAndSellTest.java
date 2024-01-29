package arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockBuyAndSellTest {
    @Test
    void testMaxProfit(){
        int[] inputArray = new int[]{7,1,5,3,6,4};
        int expectedOutput = 5;
        int actualOutput = StockBuyAndSell.maxProfit(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testZeroProfit(){
        int[] inputArray = new int[]{7,6,5,4,3};
        int expectedOutput = 0;
        int actualOutput = StockBuyAndSell.maxProfit(inputArray);
        assertEquals(expectedOutput, actualOutput);
    }
}