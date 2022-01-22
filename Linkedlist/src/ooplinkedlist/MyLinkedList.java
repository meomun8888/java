package ooplinkedlist;

public class MyLinkedList<T> {

    private class Node {
        private T info;
        private Node next;

        public Node(T info) {
            this.info = info;
            this.next = null;
        }

        public Node(T info, Node next) {
            this.info = info;
            this.next = next;
        }
    }

    private int size;
    private Node head, tail;

    public MyLinkedList() {
        this.size = 0;
        this.head = head = this.tail = tail = null;
    }

    public MyLinkedList(int size, Node head, Node tail) {
        this.size = size;
        this.head = head;
        this.tail = tail;
    }

    public void addFirst(T e) {
        Node p = new Node(e);
        if (size == 0) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
        size++;
    }

    public void addLast(T e) {
        Node p = new Node(e);
        if (size == 0) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
        size++;
    }

    public void add(int index, T e) {
        if (index <= 0 || index > size) {
            System.out.println("Invalid Index !");
            return;
        }
        if (index == 1) {
            addFirst(e);
            return;
        } else if (index == size) {
            addLast(e);
            return;
        } else {
            Node q = head.next;
            Node p = new Node(e);
            for (int i = 1; i < index; i++) {
                q = q.next;
            }
            p.next = q.next;
            q.next = p;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList Null !");
            return;
        } else {
            final Node temp = head.next;
            head = temp;
            size--;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList Null");
            return;
        } else {
            Node q = head.next;
            while (q != null) {
                if (q.next == tail) {
                    q.next = null;
                    q = tail;
                }
                q = q.next;
            }
            size--;
        }
    }

    public void remove() {
        this.removeLast();
    }

    public void remove(int index) {
        if (index <= 0 || index > size) {
            System.out.println("Invalid Index !");
            return;
        } else {
            if (index == 1) {
                removeFirst();
                return;
            } else if (index == size) {
                removeLast();
                return;
            } else {
                Node q = head.next;
                Node p = head;
                for (int i = 2; i < index; i++) {
                    q = q.next;
                    p = p.next;
                }
                p.next = q.next;
                size--;
            }
        }
    }

    public T getFist() {
        if (head == null) {
            return null;
        }
        return head.info;
    }

    public T getLast() {
        if (head == null) {
            return null;
        }
        return tail.info;
    }

    public T get(int index) {
        Node q = head.next;
        if (index <= 0 || index > size) {
            System.out.println("Invalid Index !");
            return null;
        } else {
            if (index == 1) {
                getFist();
            } else if (index == size) {
                getLast();
            } else {
                for (int i = 2; i < index; i++) {
                    q = q.next;
                }
            }
        }
        return q.info;
    }

    public String toString() {
        Node q = head;
        String s = "";
        while (q != null) {
            s += q.info + " ";
            q = q.next;
        }
        return s;
    }

}