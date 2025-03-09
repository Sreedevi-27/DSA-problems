package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlapping {
    public static void main(String[] args) {
        int a[] = new int[]{8,4,1,6,7,2,5,8};
//        int a[] = new int[]{10,11,1,12,3,4,13,8,2,6,7,9,5,3};
        int len = a.length;
        int sum=0, repeatedEle=-1;
        int totalSum = len*(len+1)/2;
        boolean[] boolArr = new boolean[len];
        for(int i=0; i<len; i++){
            sum += a[i];
            int ele=a[i]-1;
            if(boolArr[ele]){
                repeatedEle = a[i];
            }
            boolArr[ele] = true;
        }
        int missingEle = -1;
        if(totalSum>sum)   missingEle = totalSum-sum+repeatedEle;
        else missingEle = repeatedEle-(sum-totalSum);

        System.out.println(totalSum+"--->"+sum+"--->"+missingEle);
    }
    public static List<List< Integer >> mergeOverlappingIntervals(int [][]arr){
        List<List<Integer>> finalList = new ArrayList<>();
        int j=0;
        for(int i=j+1; i<arr.length; i++){
            if(arr[j][1] <= arr[i][0] || arr[j][0] <= arr[i][0]){
                List<Integer> list = new ArrayList<>();
                list.add(arr[j][0]);
                list.add(arr[i][1]);
                finalList.add(list);
                j++;
            }
        }
        return finalList;
    }
}
