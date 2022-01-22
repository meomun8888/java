package meo;

public class Test {
    public static void main(String[] args) {
        CasioFx580vn my = new CasioFx580vn();
        System.out.println("Cong: "+  my.cong(5,5));
        System.out.println("Tru: "+ my.tru(6,5));
        System.out.println("Nhan: "+ my.nhan(6,5));
        System.out.println("Chia: "+ my.chia(6,5));

        double arr[] = new double[]{1.1,2,9,5,3,4,7,58},b[];
        b = arr.clone();// copy mang
        my.sortMax(arr);
        System.out.println("Max: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nMix: ");
        my.sortMin(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
        my.display();
    }
}
