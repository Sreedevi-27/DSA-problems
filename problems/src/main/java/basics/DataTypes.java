/*
Data Type

Data type refers to the type of value a variable has and the way the computer interprets it.
Each data type has a different size. You've studied 5 different data types and the sizes of the data types:
Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte
You're given a data type. Print its size in bytes.

Example:
Input: Long
Output: 8
Explanation: The size of a Long variable is given as 8 bytes.

Expected time complexity :
The expected time complexity is O(1).

Constraints :
Time limit: 1 second
 */

package basics;

public class DataTypes {
    public static int printSizeInBytes(String input){
        switch(input){
            case "Integer" :
                return Integer.SIZE/8;
            case "Long" :
                return Long.SIZE/8;
            case "Float" :
                return Float.SIZE/8;
            case "Double" :
                return Double.SIZE/8;
            case "Character" :
                return 1;
        }
        return -1;
    }
}