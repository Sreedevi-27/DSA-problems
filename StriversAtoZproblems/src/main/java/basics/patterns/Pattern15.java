/*

A B C D E
A B C D
A B C
A B
A

 */

package basics.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            char c = 'A';
            for(int j=n; j>=i; j--){
                System.out.print((char)c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
