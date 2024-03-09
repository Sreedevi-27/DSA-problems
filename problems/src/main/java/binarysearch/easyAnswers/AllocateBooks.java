/*
Allocate Books

Given an array ‘arr’ of integer numbers, ‘arr[i]’ represents the number of pages in the ‘i-th’ book.
There are ‘m’ number of students, and the task is to allocate all the books to the students.
Allocate books in such a way that:
1. Each student gets at least one book.
2. Each book should be allocated to only one student.
3. Book allocation should be in a contiguous manner.
You have to allocate the book to ‘m’ students such that the maximum number of pages assigned to a student is minimum.
If the allocation of books is not possible, return -1.

Example 1:
Input: ‘n’ = 4 ‘m’ = 2
‘arr’ = [12, 34, 67, 90]
Output: 113
Explanation: All possible ways to allocate the ‘4’ books to '2' students are:
12 | 34, 67, 90 - the sum of all the pages of books allocated to student 1 is ‘12’, and student two is ‘34+ 67+ 90 = 191’,
so the maximum is ‘max(12, 191)= 191’.
12, 34 | 67, 90 - the sum of all the pages of books allocated to student 1 is ‘12+ 34 = 46’, and student two is ‘67+ 90 = 157’,
so the maximum is ‘max(46, 157)= 157’.
12, 34, 67 | 90 - the sum of all the pages of books allocated to student 1 is ‘12+ 34 +67 = 113’, and student two is ‘90’,
so the maximum is ‘max(113, 90)= 113’.
We are getting the minimum in the last case.
Hence answer is ‘113’.

Constraints:
2 <= 'n' <= 10 ^ 3
1 <= 'm' <= 10 ^ 3
1 <= 'arr[i]' <= 10 ^ 9
The sum of all arr[i] does not exceed 10 ^ 9.
Where ‘n’ denotes the number of books and ‘m’ denotes the number of students. ‘arr[i]’ denotes an element at position ‘i’ in the sequence.
Time limit: 1 second
 */

package binarysearch.easyAnswers;

import java.util.ArrayList;

public class AllocateBooks {
    public static int findPages(ArrayList<Integer> arr, int m) {
        int len = arr.size();
        if(len < m) return -1;
        int[] maxMin = findMaxMin(arr);
        int left = maxMin[0], right = maxMin[2];
        int max = maxMin[1];
        if(len==m) return max;
        while(left <= right){
            int mid = left+(right-left)/2;
            boolean count = findCount(arr, m, mid);
            if(count) left=mid+1;
            else right = mid-1;
        }
        return right;
    }

    public static int[] findMaxMin(ArrayList<Integer> arr){
        int sum = 0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
            int ele = arr.get(i);
            sum += ele;
            max = Math.max(max, ele);
            min = Math.min(min, ele);
        }
        return new int[]{min, max, sum};
    }

    public static boolean findCount(ArrayList<Integer> arr, int m, int mid){
        int sum = 0, count=0;
        for(int i=0; i<arr.size(); i++){
            int ele = arr.get(i);
            if(sum+ele >= mid){
                sum = ele;
                count++;
            }else
                sum += ele;
        }

        if(count >= m) return true;
        return false;
    }
}
