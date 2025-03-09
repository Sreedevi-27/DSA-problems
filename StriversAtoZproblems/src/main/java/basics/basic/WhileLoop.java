/*
Sum of even & odd

Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits
separately. Digits mean numbers, not places! That is, if the given integer is "132456".ev digits are 2, 4, and 6,
and odd digits are 1, 3, and 5.

Example:
Input: 'n' 132456
Output: 12 9
Explanation: The sum of even digits = 2+4+6=12 The sum of odd digits=1+3+5=9

Constraints
0 ='n'<=10000
 */

package basics.basic;

public class WhileLoop {
    public static int[] sumOfOddAndEvenDigits(int num){
        int evenSum=0, oddSum=0, dig=0;
        while(num>0){
            dig = num%10;
            if(dig%2==0) evenSum += dig;
            else oddSum += dig;
            num = num/10;
        }
        return new int[]{evenSum, oddSum};
    }
}
