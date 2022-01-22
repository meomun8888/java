package array.integer;

import java.util.Random;

public class Random_Array {
    private Random random = new Random();

    public int load(int start, int range) {
        return random.nextInt(range) + start;
    }
    public void load(int a[],int start, int range) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(range) + start;
        }
    }
    public void outArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
