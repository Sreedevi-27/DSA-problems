/*

E
E D
E D C
E D C B
E D C B A

 */

package basics.patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            char c = 'A';
            for(int j=1; j<=i; j++){
                System.out.print((char)(c+n-1)+" ");
                c--;
            }
            System.out.println();
        }
    }
}
