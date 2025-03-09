/*
Minimum in a Sorted and Rotated Array

A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it.

Examples:
Input: arr[] = [5, 6, 1, 2, 3, 4]
Output: 1
Explanation: 1 is the minimum element in the array.
 */


package goldmansachs;

public class MinimumElementInSortedRotatedArray {
    public static int findMinimumElement(int[] arr) {
        int low = 0, high = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low);
            if(arr[low] < arr[mid]){ // left - sorted
                min = Math.min(min, arr[low]);
                low = mid+1;
            }else{
                min = Math.min(min, arr[mid]); // right - sorted
                high = mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{41, 55, 75, 28};
        System.out.println("Ans "+findMinimumElement(arr));
    }
}






