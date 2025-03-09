/*
Rotation

You are given an array 'arr' having 'n' distinct integers sorted in ascending order. The array is right rotated 'r' times
Find the minimum value of 'r'. Right rotating an array means shifting the element at 'ith' index to (‘i+1') mod 'n' index,
for all 'i' from 0 to ‘n-1'.

Example:
Input: 'n' = 5 , ‘arr’ = [3, 4, 5, 1, 2]
Output: 3
Explanation:
If we rotate the array [1 ,2, 3, 4, 5] right '3' times then we will get the 'arr'. Thus 'r' = 3.

Expected time complexity:
Can you solve this in O(logn) time complexity?

Constraints:
1 <= ‘n’ <= 10^5
1 <= ‘arr[i]’ <= 10^9
Time Limit: 1 sec
 */

package binarysearch.easy1dArray;

public class ArrayRotationCount {
    public static int findKRotation(int []arr){
        int len = arr.length,ans=0;
        int left=0, right=len-1;
        if(arr[left]<arr[right]) return 0;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid!=len-1 && arr[mid]>arr[mid+1]) return mid+1;
            else if(mid!=0 && arr[mid]<arr[mid-1]) return mid;
            if(arr[left]<arr[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return 0;
    }
}
