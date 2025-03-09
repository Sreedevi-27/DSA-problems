/*
Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color
are adjacent, with the colors in the order red, white, and blue. We will use the integers 0, 1, and 2 to represent
the color red, white, and blue, respectively. You must solve this problem without using the library's sort function.

Example:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */

package arrays.medium;

public class Sort012 {
    public static int[] sortColors(int[] arr) {
        int len = arr.length;
        int zero=0, one=0, two=len-1;
        while(one<=two){
            if(arr[one]==0){
                int temp = arr[zero];
                arr[zero] = arr[one];
                arr[one]=temp;
                one++;
                zero++;
            } else if(arr[one]==2){
                int temp = arr[two];
                arr[two] = arr[one];
                arr[one]=temp;
                two--;
            } else
                one++;
        }
        return arr;
    }
}
