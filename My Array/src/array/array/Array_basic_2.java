package array.array;

import java.util.Arrays;

public class Array_basic_2 {

    private static int[] reverse(int[] x) {
        int[] rv = new int[x.length];
        int index = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            rv[index] = x[i];
            index++;
        }
        return rv;
    }

    public static void main(String[] args) {
        int[] a = new int[]{12, 11, 10, 02, 05, 01, 04, 2001, 2005, 2006};
        System.out.println("A: " + Arrays.toString(a));
        a = reverse(a);
        System.out.println("A after reverse sort: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("A after sort: " + Arrays.toString(a));
        System.out.println("location x = "+Arrays.binarySearch(a,10));
    }
}
