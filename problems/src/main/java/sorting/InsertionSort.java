package sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int temp = arr[i], j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
