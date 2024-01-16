package sorting;

public class InsertionSortRecursion {
    public static int[] insertionSort(int[] arr) {
        return doSort(arr, arr.length, 0);
    }

    public static int[] doSort(int[] arr, int size, int n){
        if(n==size) return arr;
        int temp = arr[n], j=n-1;
        while(j>=0 && arr[j]>temp){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
        return doSort(arr, size, n+1);
    }
}
