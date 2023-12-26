/*

 * * * * *  * * * * *
 * * * *    * * * *
 * * *      * * *
 * *        * *
 *          *
 *          *
 * *        * *
 * * *      * * *
 * * * *    * * * *
 * * * * *  * * * * *

 */

package basics.patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int num = (2*n);
        for(int i=n; i>0; i--){
            for(int j=0; j<=num; j++){
                if(j>=i && j<num-i+1)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=0; j<=num; j++){
                if(j>=i && j<num-i+1)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
