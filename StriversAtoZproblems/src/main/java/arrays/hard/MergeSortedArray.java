/*
Merge Sorted Array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing
the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate
this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n
elements are set to 0 and should be ignored. nums2 has a length of n.

Example :
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Constraints:
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109

Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */

package arrays.hard;

public class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length;
        while(n>0 && m>0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[len1-1] = nums2[n-1];
                len1--;
                n--;
            } else{
                nums1[len1-1] = nums1[m-1];
                m--;
                len1--;
            }
        }

        while(n>0){
            nums1[len1-1] = nums2[n-1];
            len1--;
            n--;
        }

        while(m>0){
            nums1[len1-1] = nums1[m-1];
            m--;
            len1--;
        }
        return nums1;
    }
}
