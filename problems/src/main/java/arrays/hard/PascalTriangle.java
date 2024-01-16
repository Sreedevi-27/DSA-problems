package arrays.hard;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        int[][] arr = new int[5][];
        for(int i=0; i<n; i++){
            arr[i] =new int[i+1];
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
    }
}

