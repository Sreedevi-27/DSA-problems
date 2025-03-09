/*
Ceil The Floor

You're given a sorted array 'a' of 'n' integers and an integer 'x'. Find the floor and ceiling of 'x' in 'a[0..n-1]'.
Note:
Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.

Example:
Input:
n=6, x=5, a=[3, 4, 7, 8, 8, 10]
Output:
4
Explanation:
The floor and ceiling of 'x' = 5 are 4 and 7, respectively.

Constraints :
1 <= n <= 2 * 10^5
1 <= a[i] <= 10^9
Time limit: 1 sec
 */

package binarysearch.easy1dArray;

public class CeilTheFloor {
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int len = arr.length;
        int left = 0, right = len-1;
        int floor = -1, ceil = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid]==x) return new int[]{x,x};
            else if(arr[mid]<x){
                floor = arr[mid];
                left = mid+1;
            }
            else{
                ceil = arr[mid];
                right = mid-1;
            }
        }
        return new int[]{floor, ceil};
    }
}
