/*
Number of Inversions

There is an integer array ‘A’ of size ‘N’. Number of inversions in an array can be defined as the number of pairs
of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’. You must return the number of inversions in the array.

Example:
Input:
A = [5, 3, 2, 1, 4], N = 5
Output:
7
Explanation:
The pairs satisfying the condition for inversion are (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), and (3, 4).
The number of inversions in the array is 7.

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^9
Time Limit: 1 sec
 */

package arrays.hard;

import java.util.ArrayList;

public class CountInversion {
    public static int numberOfInversions(int []arr) {
        return splitArray(arr, 0, arr.length-1);
    }

    public static int splitArray(int[] arr, int start, int end){
        int count=0;
        if(start>=end) return count;
        int mid = (start+end)/2;
        count += splitArray(arr, start, mid);
        count += splitArray(arr, mid+1, end);
        count += merge(arr, start, mid, end);
        return count;
    }

    public static int merge(int[] arr, int start, int mid, int end){
        int count = 0;
        int left = start;
        int right = mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while(left<=mid && right<=end){
            if(arr[left]>arr[right]){
                count += mid-left+1;
                list.add(arr[right]);
                right++;
            }
            else{
                list.add(arr[left]);
                left++;
            }
        }

        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=end){
            list.add(arr[right]);
            right++;
        }

        for(int i=start; i<=end; i++){
            arr[i] = list.get(i-start);
        }

        return count;
    }
}
