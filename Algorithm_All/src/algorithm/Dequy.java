package algorithm;

public class Dequy {
    public  static int cout = 0;
    public void HN(int n, String a, String b, String c) {
        if (n == 1) {
            cout++;
            System.out.println("Lần "+cout+" Chuyển 1 đĩa từ " + a + " -> " + c);
        } else {
            HN(n - 1, a, c, b);
            HN((1), a, b, c);
            HN(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        Dequy x = new Dequy();
        x.HN(10,"A","B","C");
    }
}