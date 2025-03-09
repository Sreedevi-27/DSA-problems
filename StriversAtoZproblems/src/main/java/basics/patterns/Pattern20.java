/*

 *                 *
 * *             * *
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                 *

 */

package basics.patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        int col = n*2 -1;
        for(int i=1; i<=col; i++){
            for(int j=1; j<=col+1; j++){
                if(i<=n) {
                    if(j<=i || (j>n && j>=col-i+2))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }else{
                    if(j>i || (j<n && j<=col-i+1))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
