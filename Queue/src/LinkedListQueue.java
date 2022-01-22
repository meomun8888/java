public class LinkedListQueue<E> {
    private class Node<E> {
        private E data;
        private Node next;

        public Node(E e) {
            this.data = e;
            this.next = null;
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size < 1;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) tail.data;
    }

    public boolean add(E info) {
        try {
            Node newNode = new Node(info);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E temp = (E) head.data;
        head = head.next;
        size--;
        return temp;
    }

}
