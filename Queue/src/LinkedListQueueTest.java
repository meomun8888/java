import static org.junit.jupiter.api.Assertions.*;

class LinkedListQueueTest {

    @org.junit.jupiter.api.Test
    void add() {
        LinkedListQueue<Integer> x = new LinkedListQueue<>();
        x.add(5);
        System.out.println(equals(x));
    }
}