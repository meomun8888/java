package array.array;

import java.util.Arrays;

public class Array_basic {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        int [] b =  a;
        b[0] = 100;
        System.out.println("Cach 1: = ");
        System.out.println("a[]: "+ Arrays.toString(a));
        System.out.println("b[]: "+ Arrays.toString(b));

        System.out.println("Cach 2: clone()");
        int []c = a.clone();
        c[1] = 101;
        System.out.println("C: "+Arrays.toString(c));
        System.out.println("A: "+Arrays.toString(a));

        System.out.println("Canh 3: System.arraycopy(mang muon copy, begin, arry copy, begin, end)");
        int []m = new int[a.length];
        System.arraycopy(a,0,m,0,a.length);
        m[2] = 102;
        System.out.println("m: "+Arrays.toString(m));
        System.out.println("A: "+Arrays.toString(a));

        Arrays.sort(a);
        System.out.println();
    }
}
