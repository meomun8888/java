public class ArrayQueue<E> {
    private E[] array;
    private int capacity, size, head, tail;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.head = this.tail = this.size = 0;
        this.array = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size < 1;
    }

    public E peek() {
        if (size == 0) {
            System.out.println("Queue isEmpty !");
            return null;
        }
        return array[head];
    }

    public boolean add(E e) {
        if (size == capacity) {
            System.out.println("Queue Full !");
            return false;
        }
        array[tail] = e;
        tail++;
        tail = tail % array.length;
        size++;
        return true;
    }

    public E pop() {
        if (size == 0) {
            System.out.println("Queue isEmpty !");
            return null;
        }
        E temp = array[head];
        head++;
        head = head % array.length;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }
}
