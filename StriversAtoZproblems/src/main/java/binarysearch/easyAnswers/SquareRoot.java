/*
Square Root of a number

You are given a positive integer ‘n’. Your task is to find and return its square root. If ‘n’ is not a perfect square,
then return the floor value of sqrt(n).

Example:
Input: ‘n’ = 7
Output: 2
Explanation:
The square root of the number 7 lies between 2 and 3, so the floor value is 2.

Expected Time Complexity:
Try solving this in O(log(n)).

Constraints:
0 <= n <= 10 ^ 9
Time Limit: 1 sec.
 */

package binarysearch.easyAnswers;

public class SquareRoot {
    public static int sqrtN(long N) {
        int ans=0;
        long left = 1, right=N;
        while(left<=right){
            long mid = left+(right-left)/2;
            long square = (long)(mid*mid);
            if(square<=N){
                ans = (int)mid;
                left = mid+1;
            }
            else right=mid-1;
        }
        return ans;
    }
}
