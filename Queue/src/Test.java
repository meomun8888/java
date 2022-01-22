import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        ArrayQueue<Integer> arr = new ArrayQueue<>(100);
        LinkedListQueue<Integer> ls = new LinkedListQueue<>();
        ls.add(1);
        System.out.println(ls);
    }
}
