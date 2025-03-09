/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */

package basics.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print(i-j+1+" ");
            }
            System.out.println();
        }
    }
}
