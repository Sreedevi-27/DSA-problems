package sorting;

public class QuickSort {
    public static int[] sort(int[] input){
        return quickSort(input, 0, input.length-1);
    }
    public static int[] quickSort(int[] input, int startIndex, int endIndex) {
        if(startIndex<endIndex){
            int pivot = findPivot(input, startIndex, endIndex);
            quickSort(input, startIndex, pivot-1);
            quickSort(input, pivot+1, endIndex);
        }
        return input;
    }

    public static int findPivot(int[] input, int start, int end){
        int pivot = input[start];
        int i=start, j=end;
        while(i<j){
            while(input[i] <= pivot && i<=end-1) i++;
            while(input[j] > pivot && j>=start+1) j--;
            if(i<j){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[j];
        input[j] = input[start];
        input[start] = temp;
        return j;
    }
}
