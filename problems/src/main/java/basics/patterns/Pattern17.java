/*

    A
   A B A
  A B C B A
 A B C D C B A
A B C D E D C B A

 */

package basics.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        int num = (2*n)-1;
        for(int i=n; i>0; i--){
            char c = 'A';
            for(int j=1; j<=num; j++){
                if(j>=i && j<=num-i+1){
                    System.out.print((char)c+" ");
                    if(j<n)
                        c++;
                    else
                        c--;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
