/*
Check Prime Number

A prime number is a positive integer that is divisible by exactly 2 integers, 1 and the number itself.
You are given a number 'n'. Find out whether 'n' is prime or not.

Example :
Input: 'n' = 5
Output: YES
Explanation: 5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5.

Expected time complexity :
The expected time complexity is O(sqrt('n')).

Constraints :
1 <= 'n' <= 10 ^ 9
Time limit: 1 second
 */

package basics.math;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        if(num==1) return false;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
