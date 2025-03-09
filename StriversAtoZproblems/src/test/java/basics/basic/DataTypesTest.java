package basics.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypesTest {
    @Test
    void testWithInteger(){
        String input = "Integer";
        int expectedOutput = 4;
        int actualOutput = DataTypes.printSizeInBytes(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithFloat(){
        String input = "Float";
        int expectedOutput = 4;
        int actualOutput = DataTypes.printSizeInBytes(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithLong(){
        String input = "Long";
        int expectedOutput = 8;
        int actualOutput = DataTypes.printSizeInBytes(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithDouble(){
        String input = "Double";
        int expectedOutput = 8;
        int actualOutput = DataTypes.printSizeInBytes(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithCharacter(){
        String input = "Character";
        int expectedOutput = 1;
        int actualOutput = DataTypes.printSizeInBytes(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testWithInvalidInput(){
        String input = "Sree";
        int expectedOutput = -1;
        int actualOutput = DataTypes.printSizeInBytes(input);
        assertEquals(expectedOutput, actualOutput);
    }
}