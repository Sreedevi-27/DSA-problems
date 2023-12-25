/*

1         1
1 2       2 1
1 2 3     3 2 1
1 2 3 4   4 3 2 1
1 2 3 4 5 5 4 3 2 1

 */

package basics.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int col = n*2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=col; j++){
                if(j<=i || j>=col-i+1) {
                    if (j <= n)
                        System.out.print(j+" ");
                    else
                        System.out.print(col - j + 1+" ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
