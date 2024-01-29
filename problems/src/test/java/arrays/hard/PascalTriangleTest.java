package arrays.hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {
    @Test
    void testPascalTriangle(){
        int input = 5;
        List<List<Integer>> expectedOutput = Arrays.asList(Arrays.asList(1),Arrays.asList(1,1),Arrays.asList(1,2,1),
                                                           Arrays.asList(1,3,3,1),Arrays.asList(1,4,6,4,1));
        Integer[][] expectedOutputArray  = expectedOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        List<List<Integer>> actualOutput = PascalTriangle.generate(input);
        Integer[][] actualOutputArray  = actualOutput.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][] ::new);
        assertArrayEquals(expectedOutputArray, actualOutputArray);
    }
}