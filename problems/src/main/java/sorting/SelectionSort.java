package sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int mini = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[mini]>arr[j])
                    mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
