/*

 *********
  *******
   *****
    ***
     *

 */

package basics.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int num = (2*n)-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=num; j++){
                if(j>=i && j<=num-i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
