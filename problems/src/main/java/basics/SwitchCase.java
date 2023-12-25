/*
Switch Case statement

Programming languages have some conditional/decision-making statements that execute when some specific condition is fulfilled.
Switch-case is one of the ways to implement them
In a menu-driven program, the user is given a set of choices of things to do (the menu) and then is asked to select a menu item
There are 2 choices in the menu
Choice 1 is to find the area of a circle having radius r
Choice 2 is to find the area of a rectangle having dimensions and 'b'
You are given the choice 'ch' and an array 'a'
If 'ch' is 1, 'a' contains a single number 'r' if "ch' is 2. 'a' contains 2 numbers, 'I and b'.
Consider the choice and print the appropriate area.

Example:
Input: "ch' = 2 and 'a' = [3, 2]
Output area = 6
Explanation: Since the choice 'ch' is 2, we have to print the area of the rectangle having 'I' = 3 and 'b' = 2, which is 6

Expected time complexity :
The expected time complexity is O(1).

Constraints :
1 <= ‘ch’ <= 2
1 <= ‘r’ <= 100
1 <= ‘l’, ‘b’ <= 100
Time limit: 1 second
*/

package basics;

public class SwitchCase {
    public static double areaSwitchCase(int ch, double []a) {
        switch(ch){
            case 1:
                return a[0]*a[0]*Math.PI;
            case 2:
                return a[0]*a[1];
        }
        return -1;
    }
}
