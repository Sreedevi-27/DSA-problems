package sorting;

import java.util.ArrayList;

public class MergeSort {
    public static int[] performMergeSort(int[] arr){
        return mergeSort(arr, 0, arr.length-1);
    }
    public static int[] mergeSort(int[] arr, int l, int r){
        if(l>=r) return arr;
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
        return arr;
    }

    public static void merge(int[] arr, int l, int mid, int r){
        int left = l;
        int right = mid+1;
        ArrayList<Integer> al = new ArrayList<>();

        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                al.add(arr[left]);
                left++;
            } else{
                al.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            al.add(arr[left]);
            left++;
        }

        while(right<=r){
            al.add(arr[right]);
            right++;
        }

        for(int i=l; i<=r; i++){
            arr[i] = al.get(i-l);
        }
    }
}
