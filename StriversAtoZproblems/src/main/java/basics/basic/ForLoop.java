/*
Nth Fibonacci Number

The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
F(n)=F(n-1)+F(n-2),
Where, F(1) 1, F(2) = 1
Provided 'n'you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by
using conditionals like if else and return what's expected. "Indexing is start from 1"

Example:
Input: 6
Output: B
Explanation: The number is '6' so we have to find the "6th" Fibonacci number. So by using the given formula of the
Fibonacci series, we get the series: [1, 1, 2, 3, 5, 8, 13, 21] So the "6th element is "8" hence we get the output.

Expected time complexity :
The expected time complexity is O(n).

Constraints:
1 <= 'n' <= 10000
Where ‘n’ represents the number for which we have to find its equivalent Fibonacci number.
Time Limit: 1 second
 */

package basics.basic;

public class ForLoop {
    public static int printNthFibonacciNumber(int input){
        if(input==0 || input==1)
            return input;

        int n1 = 0, n2 = 1;
        for(int i=2; i<=input; i++){
            int temp = n2;
            n2 = n1+n2;
            n1 = temp;
        }
        return n2;
    }

    /*
    RECURSION:
    public static int printFib(int in){
		if(in==1 || in==0)
			return in;
		return printFib(in-1)+printFib(in-2);
	}
     */
}
