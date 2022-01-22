
public class Math {
    public static void main(String[] args) {
        int a = 5;
        int b = -5;
        boolean c = true;
        System.out.println("~5 = " + ~a);
        System.out.println("~(-5) = " + ~(b));
        System.out.println("(a == 5 ^ b == 5) = " + (a == 5 ^ b == 5));
        System.out.println("(c = true) => !c = " + !c);

        System.out.println(a<<a);
    }
}