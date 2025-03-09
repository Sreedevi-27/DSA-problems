package goldmansachs;

public class RockCollector {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 0, 5}, {0, 1, 1, 1, 0}, {2, 0, 0, 0, 0}};
        int row = arr.length;
        int col = arr[0].length;
        int[][] dp = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(findOptimalPath(arr, dp, row-1, 0));
        System.out.println(findOptimalPathTabulation(arr));
        System.out.println(calculate(arr, row-1, 0));
    }

    public static int findOptimalPath(int[][] arr, int[][] dp, int i, int j){
        if(i<0 || j>=arr[0].length) return Integer.MIN_VALUE;
        if(i==0 && j==arr[0].length-1) return arr[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int up =  findOptimalPath(arr, dp, i-1, j);
        int right = findOptimalPath(arr, dp, i, j+1);
        dp[i][j] = arr[i][j]+Math.max(up, right);
        return dp[i][j];
    }


    public static int calculate(int[][] grid, int i, int j) {
        if (i < 0 || j == grid[0].length) return Integer.MIN_VALUE;
        if (i == 0 && j == grid[0].length - 1) return grid[i][j];
        return grid[i][j] + Math.max(calculate(grid, i - 1, j), calculate(grid, i, j + 1));
    }


    public static int findOptimalPathTabulation(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] dp = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                dp[i][j] = -1;
            }
        }
        dp[row-1][0] = arr[row-1][0];
        for(int i=row-2; i>=0; i--) dp[i][0] = dp[i+1][0]+arr[i][0];
        for(int i=1; i<col; i++) dp[row-1][i] = dp[row-1][i-1]+arr[row-1][i];

        for(int i=row-2; i>=0; i--){
            for(int j=1; j<col; j++){
                dp[i][j] = arr[i][j] + Math.max(dp[i+1][j], dp[i][j-1]);
            }
        }
        return dp[0][col-1];
    }
}
