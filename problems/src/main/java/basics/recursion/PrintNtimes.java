/*
Print N times

You are given an integer ‘n’.
Print “Coding Ninjas ” ‘n’ times, without using a loop.

Example:
Input: ‘n’  = 4
Output: Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas
Explanation: “Coding Ninjas” is printed 4 times.

Expected Space Complexity:
Try to solve this in O(n).

Constraints:
1 <= 'n' <= 10^4
Time Limit: 1 sec
 */
package basics.recursion;

public class PrintNtimes {
    public static String printNtimes(int n){
       return rec(n, "");
    }

    public static String rec(int n, String str){
        if(n<1)
            return str;
        str += "Coding Ninjas ";
        return rec(n-1, str);
    }
}
