/*
If-else

Programming languages have some conditional/decision-making statements that execute when some specific condition is fulfilled.
If-else is one of the ways to implement them. You are given two numbers 'a' and 'b'. Compare the numbers and print the relation.
Print "smaller", "greater" or "equal" when 'a' is smaller than 'b', greater than 'b'. or equal to 'b' respectively.

Example:
Input: 'a' = 5 and 'b' = 3
Output: greater
Explanation: Since 'a' (= 5) is greater than 'b' (= 3), we are printing "greater".

Expected time complexity :
The expected time complexity is O(1).

Constraints :
-10 ^ 5 <= ‘a’ <= 10 ^ 5
-10 ^ 5 <= ‘b’ <= 10 ^ 5
Time limit: 1 second
 */

package basics.basic;

public class IfElse {
    public static String compareIfElse(int a, int b) {
        if(a<b)
            return "smaller";
        else if(a>b)
            return "greater";
        return "equal";
    }
}
