/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */

package basics.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int col = n*2 -1;
        for(int i=1; i<=col; i++){
            for(int j=1; j<=n; j++){
                if(i>n && j<=col-i+1 || (i<=n && j<=i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
