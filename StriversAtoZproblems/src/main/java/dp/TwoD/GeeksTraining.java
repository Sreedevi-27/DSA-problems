/*
Geek's Training

Geek is going for a training program for n days. He can perform any of these activities: Running, Fighting, and Learning
Practice. Each activity has some point on each day. As Geek wants to improve all his skills, he can't do the same activity
on two consecutive days. Given a 2D array arr[][] of size n where arr[i][0], arr[i][1], and arr[i][2] represent the merit
points for Running, Fighting, and Learning on the i-th day, determine the maximum total merit points Geek can achieve .

Example:
Input: arr[]= [[1, 2, 5], [3, 1, 1], [3, 3, 3]]
Output: 11
Explanation: Geek will learn a new move and earn 5 point then on second day he will do running and earn 3 point and on third day he will do fighting and earn 3 points so, maximum merit point will be 11.

Input: arr[]= [[1, 1, 1], [2, 2, 2], [3, 3, 3]]
Output: 6
Explanation: Geek can perform any activity each day while adhering to the constraints, in order to maximize his total merit points as 6.

Input: arr[]= [[4, 2, 6]]
Output: 6
Explanation: Geek will learn a new move to make his merit points as 6.

Constraint:
1 <=  n <= 105
1 <=  arr[i][j] <= 100
 */

package dp.TwoD;

public class GeeksTraining {
    public static int recursion(int arr[][]) {
        int row = arr.length;
        return recursionHelper(arr,row-1,3);
    }

    public static int recursionHelper(int[][] arr, int index, int last){
        int maximum = 0;
        if(index==0){
            for(int i=0; i<=2; i++){
                if(i!=last){
                    maximum = Math.max(maximum, arr[0][i]);
                }
            }
            return maximum;
        }

        maximum=0;
        int points=0;
        for(int i=0; i<=2; i++){
            if(i!=last){
                points = arr[index][i] + recursionHelper(arr, index-1, i);
                maximum = Math.max(maximum, points);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}};
        System.out.println(memoization(mat));
    }

    public static int memoization(int arr[][]) {
        int row = arr.length;
        int[][] dp = new int[row][4];
        for(int i=0; i<row; i++){
            for(int j=0; j<4; j++) dp[i][j] = -1;
        }

        return memoizationHelper(arr,row-1,3, dp);
    }


    public static int memoizationHelper(int[][] arr, int index, int last, int[][] dp){
        if(index<0) return 0;
        if(dp[index][last] != -1) return dp[index][last];

        int maximum=0;
        int points;
        for(int i=0; i<3; i++){
            if(i!=last){
                points = arr[index][i] + memoizationHelper(arr, index-1, i, dp);
                maximum = Math.max(maximum, points);
            }
        }
        dp[index][last] = maximum;
        return dp[index][last];
    }

    public static int tabulation(int[][] arr){
        int row = arr.length;
        int[][] dp = new int[row][4];

        for(int last=0; last<4; last++){
            int maximum = 0;
            for(int task=0; task<3; task++){
                if(task!=last) maximum = Math.max(maximum, arr[0][task]);
            }
            dp[0][last] = maximum;
        }

        for(int day=1; day<row; day++){
            for(int last=0; last<4; last++){
                int maximum=0;
                int points;
                for(int task=0; task<3; task++){
                    if(task!=last){
                        points = arr[day][task] + dp[day-1][task];
                        maximum = Math.max(maximum, points);
                    }
                }
                dp[day][last] = maximum;
            }
        }
        return dp[row-1][3];
    }

    public static int tabulationSpaceOptimisation(int[][] arr){
        int row = arr.length;
        int[] dp = new int[4];

        for(int last=0; last<4; last++){
            dp[last] = 0;
            for(int task=0; task<3; task++){
                if(task!=last) dp[last] = Math.max(arr[0][task], dp[last]);
            }
        }

        for(int day=1; day<row; day++){
            int[] temp = new int[4];
            for(int last=0; last<4; last++){
                temp[last] = 0;
                for(int task=0; task<3; task++){
                    if(task!=last){
                        temp[last] = Math.max(arr[day][task] + dp[task], temp[last]);
                    }
                }
            }
            dp = temp;
        }

        return dp[3];
    }
}
