public class Function {

    public long fibonacci(long n) {
        if (n == 1) {
            return 1;
        }
        return n * fibonacci(n-1);
    }

    public void hello(int n){
        int i = 0;
        System.out.println("Hello !"+n);
        if (n == 1){
            return;
        }
        hello(n-1);
    }
}
