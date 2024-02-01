/*
Number of occurrence

You have been given a sorted array/list of integers 'arr' of size 'n' and an integer 'x'. Find the total number of occurrences of 'x' in the array/list.

Example:
Input: 'n' = 7, 'x' = 3
'arr' = [1, 1, 1, 2, 2, 3, 3]
Output: 2
Explanation: Total occurrences of '3' in the array 'arr' is 2.

Expected time complexity:
The expected time complexity is O(log 'n').

Constraints:
1 <= n <= 10^4
1 <= arr[i] <= 10^9
1 <= x <= 10^9
Where arr[i] represents the element i-th element in the array/list.
Time Limit: 1sec
 */

package binarysearch.easy1dArray;

public class NumberOfOccurrence {
    public static int count(int arr[], int x) {
        int first = findFirstOccurence(arr, x);
        if(first==-1) return 0;
        int last = findLastOccurence(arr, x);
        return last-first+1;
    }

    public static int findFirstOccurence(int[] arr, int x){
        int len = arr.length;
        int left = 0, right = len-1, ans = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==x){
                ans = mid;
                right = mid-1;
            } else if(arr[mid]>x) right = mid-1;
            else left = mid+1;
        }
        return ans;
    }

    public static int findLastOccurence(int[] arr, int x){
        int len = arr.length;
        int left = 0, right = len-1, ans = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==x){
                ans = mid;
                left = mid+1;
            } else if(arr[mid]>x) right = mid-1;
            else left = mid+1;
        }
        return ans;
    }
}
