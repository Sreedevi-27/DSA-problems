/*

4444444
4333334
4322234
4321234
4322234
4333334
4444444

 */

package basics.patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4, num = 2*n -1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                int top = i;
                int bottom = 2*n-i;
                int left = j;
                int right = 2*n-j;
                System.out.print(n+1-Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
