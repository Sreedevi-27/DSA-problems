package basics.math;

import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public static List< Integer > printDivisors(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0) list.add(i);
        }
        return list;
    }
}
