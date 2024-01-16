package sorting;

public class BubbleSortRecursion {
    public static int[] bubbleSort(int[] arr, int n) {
        if(n==1) return arr;
        for(int j=0; j<n-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        return bubbleSort(arr, n-1);
    }
}
