/*
Find Character Case

Write a program that takes a Character as Input and prints 0,1,-1 according to the following rules
1, if a character is upper case (A to Z)
0, if a character is lower case (a to z)
-1, if a character is not an alphabet

Example:
Input : v
Output : 0
Explanation : The input character is lowercase, so our answer is 0.

Constraints :
The input can be any single character.
 */

package basics.basic;

public class InputOutput {
    public static int printInputOutput(Character input){
        if (input >= 65 && input <= 90)
           return 1;
        else if (input >= 97 && input <= 122)
            return 0;
        return -1;
    }
}
