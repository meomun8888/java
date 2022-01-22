package algorithm;
import java.util.Arrays;
public class Test {


    public static void main(String[] args) {
        Sort arr = new Sort();
        int a[] = new int[]{8, 6, 9, 4, 2, 6, 7, 1, 2, 3, 6, 4, 8, 9, 7};
        double b[] = new double[]{8.3, 6.4, 9.88, 4.444, 2.1, 6.7, 7.3, 1.3333, 2.77, 3.9, 677.55, 4.44, 8.7, 9.99, 7.1};

        arr.insertionSort(a,1);
//        arr.insertionSort(b,2);
        System.out.println("insertionSort int "+Arrays.toString(a));
//        System.out.println("insertionSort double "+Arrays.toString(b));

//        arr.bubbleSort(a,1);
//        arr.bubbleSort(b,1);
//        System.out.println("bubbleSort int "+Arrays.toString(a));
//        System.out.println("bubbleSort double "+Arrays.toString(b));

//        arr.selectionSort(a);
//        arr.selectionSort(b);
//        System.out.println("selectionSort int "+Arrays.toString(a));
//        System.out.println("selectionSort double "+Arrays.toString(b));



//        Dequy dq = new Dequy();
//        dq.HN(3,"A","B","C");

//        Algorithm al = new Algorithm();
//        long[] k = new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        long[] c = k.clone();
//        System.out.println("k: " + Arrays.toString(k));
//        al.loopK(k, 4);
//        System.out.println("After loop k n: " + Arrays.toString(k));
//        al.solution(c, 4);
//        System.out.println("solution: " + Arrays.toString(c));
//        Random random = new Random();
//        long x;
//        long[] longs = new long[69999999] ;
//        long startTime = System.currentTimeMillis();
//        for (long i = 0; i <= 59999999; i++) {
//            x = random.nextInt(1, 1000);
//            longs[(int) i] = x;
//        }
//        al.solution(longs,5999999);
//        System.out.println(Arrays.toString(longs));
//        long endTime = System.currentTimeMillis();
//        System.out.println("That took " + (endTime - startTime) + " milliseconds");
//        for (int i = 1;i<=100;i++) {
//            arr.xxx(i);
//        }
        Search sr = new Search();
        System.out.println(sr.searchBinary(a,8));
        // hello
    }
}
