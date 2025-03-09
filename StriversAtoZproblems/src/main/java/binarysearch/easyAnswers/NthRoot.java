/*
Find Nth Root Of M

You are given two positive integers 'n' and 'm'. You have to return the 'nth' root of 'm', i.e. 'm(1/n)'.
If the 'nth root is not an integer, return -1.
Note:
'nth' root of an integer 'm' is a number, which, when raised to the power 'n', gives 'm' as a result.

Example:
Input: ‘n’ = 3, ‘m’ = 27
Output: 3
Explanation:
3rd Root of 27 is 3, as (3)^3 equals 27.

Expected Time Complexity:
Try to do this in O(log(n+m)).

Constraints:
1 <= n <= 30
1 <= m <= 10^9
Time Limit: 1 sec.
 */

package binarysearch.easyAnswers;

public class NthRoot {
    public static int findNthRoot(int n, int m) {
        int left=1, right=m;
        while(left<=right){
            int mid = left + (right-left)/2;
            long val = (long)Math.pow(mid, n);
            if(val==(long)m) return mid;
            else if(val>(long)m) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}
