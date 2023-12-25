/*

     *
    ***
   *****
  *******
 *********

 */

package basics.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int num = (2*n)-1;
        for(int i=n; i>0; i--){
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
