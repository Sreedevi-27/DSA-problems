/*
Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */

package binarysearch.easyAnswers;

public class MedianOfSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int len = len1+len2;

        // because I need to do binary search on array which have smaller length;
        if(len1 > len2) return findMedianSortedArrays(nums2, nums1);
        int low=0, high = len1;
        int left = (len1+len2+1)/2;

        while(low <= high){
            int mid1 = low+(high-low)/2;
            int mid2 =  left-mid1;
            int left1 = (mid1>0) ? nums1[mid1-1] : Integer.MIN_VALUE;
            int left2 = (mid2>0) ? nums2[mid2-1] : Integer.MIN_VALUE;
            int right1 = (mid1 < len1) ? nums1[mid1] : Integer.MAX_VALUE;
            int right2 = (mid2 < len2) ? nums2[mid2] : Integer.MAX_VALUE;
            if(left1<=right2 && left2<=right1){
                if(len%2==0) return (double)(Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                else return Math.max(left1, left2);
            }
            else if(left1>right2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
    }
}
