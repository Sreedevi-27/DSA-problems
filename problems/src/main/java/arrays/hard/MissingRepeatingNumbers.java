/*
Missing And Repeating Numbers

You are given an array of ‘N’ integers where each integer value is between ‘1’ and ‘N’.
Each integer appears exactly once except for ‘P’, which appears exactly twice, and ‘Q’, which is missing.
Your task is to find ‘P’ and ‘Q’ and return them respectively.

Example:
Input: ‘N’ = 4
‘A’ = [1, 2, 3, 2]
Output: {2, 4}
Explanation: The integer appearing twice is ‘2’, and the integer missing is ‘4’.

Constraints:
2 <= N <= 10^5
1 <= A[i] <= N
Time Limit: 1-sec
 */

package arrays.hard;

public class MissingRepeatingNumbers {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int len = a.length;
        int sum=0, repeatedEle=-1,missingEle = -1;
        int totalSum = len*(len+1)/2;

        boolean[] boolArr = new boolean[len];
        for(int i=0; i<len; i++){
            sum += a[i];
            int ele=a[i]-1;
            if(boolArr[ele]){
                repeatedEle = a[i];
            }
            boolArr[ele] = true;
        }

        if(totalSum>sum)   missingEle = totalSum-sum+repeatedEle;
        else missingEle = repeatedEle-(sum-totalSum);
        return new int[]{repeatedEle, missingEle};
    }
}
