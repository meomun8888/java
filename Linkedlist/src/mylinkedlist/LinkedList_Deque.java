package mylinkedlist;

public class LinkedList_Deque<E> {
    private class Node {
        private E data;
        private Node next;

        public Node(E e) {
            this.data = e;
            this.next = null;
        }
    }

    public Node head, tail;

    public LinkedList_Deque() {
        this.head = this.tail = null;
    }

    public void addFist(E e) {
        Node q = new Node(e);
        if (head == null && tail == null) {
            head = tail = q;
        } else {
            q.next = head;
            head = q;
        }
    }

    public void addLast(E e) {
        Node q = new Node(e);
        if (head == null && tail == null) {
            head = tail = q;
        } else {
            tail.next = q;
            tail = q;
        }
    }

    private String getData(Node node) {
        if (node == null) {
            return "";
        }
        return " " + node.data + getData(node.next);
    }

    public String toString() {
        return getData(head);
    }
    private int count(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + count(node.next);
    }

    public int size() {
        return count(head);
    }
}
