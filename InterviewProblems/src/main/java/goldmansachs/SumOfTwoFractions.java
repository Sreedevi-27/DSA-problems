/*
Given two arrays arr1[] and arr2[] of length N which contains Numerator and Denominator of N fractions respectively,
the task is to find the sum of the given N fractions in reduced form.

Examples:
Input: arr1[] = { 1, 2, 5 }, arr2[] = { 2, 1, 6 }
Output: 10/3

Input: arr1[] = { 1, 1 } arr2[] = { 2, 2 }
Output: 1/1
 */

package goldmansachs;

public class SumOfTwoFractions {
    public static void main(String[] args) {
        int[] numerators = new int[]{1, 2, 5};
        int[] denominators = new int[]{2, 1, 6 };
        System.out.println(findSumOfTwoFractions(numerators, denominators));
    }
    public static int findSumOfTwoFractions(int[] numerators, int[] denominators){
        /*
         Formula :  a * b => LCM (a,b) * GCD (a,b)
         1/2 + 5/6
        1. findLCM(2, 6) => 6
        2. finalDenominator => 6 (LCM value)
        3. findNumeratorUsingLCM => 1/2 -> 1*(finalDenominator/denominator) / 6 => 1*(6/2) / 6 => 1*3 / 6 => 3/6
                                 => 5/6 -> 5*(finalDenominator/denominator) / 6 => 5*(6/6) / 6 => 5*1 / 6 => 5/6
        4. Sum the Numerators in parallel. SumOfNumerators => 3+5 => 8
        5. SumOfFractions => 8/6
        6. GCD(8, 6) => 24
         */

        int finalDenominator = denominators[0];
        for(int i=1; i<denominators.length; i++)
            finalDenominator = findLCM(finalDenominator, denominators[i]);


        int finalNumerator = 0;
        for(int i=0; i<numerators.length; i++)
            finalNumerator += (numerators[i]) * (finalDenominator/denominators[i]);

        int finalGCD = findGCD(finalNumerator, finalDenominator);
        finalNumerator /= finalGCD;
        finalDenominator /= finalGCD;

        System.out.println(finalNumerator+" / "+finalDenominator);
        return finalNumerator/finalDenominator;
    }

    public static int findGCD(int a, int b){
        if(a==0) return b;
        return findGCD(b%a, a);
    }

    public static int findLCM(int a, int b){
       // Formula :  a * b => LCM (a,b) * GCD (a,b)
        return (a*b) / findGCD(a, b);
    }
}
