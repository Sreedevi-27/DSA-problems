package goldmansachs;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {-5, 3, 6, 12, 15};
        int b[] = {-12, -10, -6, -3, 4, 10};
        System.out.println(findMedian(a,b));

        int c[] = {2, 3, 5, 8};
        int d[] = {10, 12, 14, 16, 18, 20};
        System.out.println(findMedian(c,d));
    }

    public static int findMedian(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len = len1+len2;
        int midEle = (len1+len2+1)/2;

        if(len1 > len2) return findMedian(arr2, arr1);
        int low = 0, high = len1;
        while (low <= high){
            int mid1 = low + (high-low)/2;
            int mid2 = midEle - mid1;
            int left1 = (mid1>0) ? arr1[mid1-1] : Integer.MIN_VALUE;
            int left2 = (mid2>0) ? arr2[mid2-1] : Integer.MIN_VALUE;
            int right1 = (mid1<len1) ? arr1[mid1] : Integer.MAX_VALUE;
            int right2 = (mid2<len2) ? arr2[mid2] : Integer.MAX_VALUE;
            if(left1<=right2 && left2<=right1){
                if(len%2 == 0) return (Math.max(left1, left2) + Math.min(right1, right2))/2;
                else return Math.max(left1, left2);
            } else if(left1 < right2) low = mid1+1;
            else high = mid1-1;
        }
        return 0;
    }
}
