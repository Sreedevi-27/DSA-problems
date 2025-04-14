package dp.grids;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class MinimumPathTriangleTest {
    @Test
    public void testMemoizationSolution() {
        int expectedOutput = 11;
        Integer[][] inputArray = new Integer[][]{
                {2},{3,4},{6,5,7},{4,1,8,3}
        };
        int actualOutput = MinimumPathTriangle.memoization(Arrays.stream(inputArray)
                .map(Arrays::asList)
                .collect(Collectors.toList()));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMemoizationSolution1() {
        int expectedOutput = -10;
        Integer[][] inputArray = new Integer[][]{
                {-10}
        };
        int actualOutput = MinimumPathTriangle.memoization(Arrays.stream(inputArray)
                .map(Arrays::asList)
                .collect(Collectors.toList()));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution() {
        int expectedOutput = 11;
        Integer[][] inputArray = new Integer[][]{
                {2},{3,4},{6,5,7},{4,1,8,3}
        };
        int actualOutput = MinimumPathTriangle.tabulation(Arrays.stream(inputArray)
                .map(Arrays::asList)
                .collect(Collectors.toList()));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSolution1() {
        int expectedOutput = -10;
        Integer[][] inputArray = new Integer[][]{
                {-10}
        };
        int actualOutput = MinimumPathTriangle.tabulation(Arrays.stream(inputArray)
                .map(Arrays::asList)
                .collect(Collectors.toList()));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution() {
        int expectedOutput = 11;
        Integer[][] inputArray = new Integer[][]{
                {2},{3,4},{6,5,7},{4,1,8,3}
        };
        int actualOutput = MinimumPathTriangle.tabulationSpaceOptimized(Arrays.stream(inputArray)
                .map(Arrays::asList)
                .collect(Collectors.toList()));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTabulationSpaceOptimisedSolution1() {
        int expectedOutput = -10;
        Integer[][] inputArray = new Integer[][]{
                {-10}
        };
        int actualOutput = MinimumPathTriangle.tabulationSpaceOptimized(Arrays.stream(inputArray)
                .map(Arrays::asList)
                .collect(Collectors.toList()));
        assertEquals(expectedOutput, actualOutput);
    }
}
