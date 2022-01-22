// TODO: 31/12/2021
/*
    addFirst();
    addLast();
    add() => index;

    removeFirst();
    removeLast();
    remove() => index;

    set();
    getFirst();
    getLast();
    get() => index;

    indexOf();
    lastIndexOf();

    contrains();
    toString();
    size();
*/
package mylinkedlist;

import java.util.ArrayList;
import java.util.Stack;

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
    private Node head;
    private Node tail;

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
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (size == 1) {
            head = tail = null;
            return;
        }
        Node q = head;
        while (q.next != tail) {
            q = q.next;
        }
        tail = q;
        tail.next = null;
        size--;

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
                Node temp1 = head.next;
                Node temp2 = head;
                for (int i = 2; i < index; i++) {
                    temp2 = temp1;
                    temp1 = temp1.next;
                }
                temp2.next = temp1.next;
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

    public int indexOf(T e) {
        int index = 1;
        if (e == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.info == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (e.equals(x.info)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T e) {
        int index = 1, temp = -1;
        if (e == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.info == null) {
                    temp = index;
                }
                index++;
            }
            return temp;
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (e.equals(x.info)) {
                    temp = index;
                }
                index++;
            }
            return temp;
        }
    }

    public boolean contains(T e) {
        return indexOf(e) > 0;
    }

    public void deleteList() {
        head = null;
        size = 0;
    }

    public void set(int index, T e) {
        Node setNode = new Node(e);
        if (index < 0 || index > size) {
            System.out.println("Invalid Index !");
            return;
        }
        if (index == 1) {
            head.info = setNode.info;
        } else if (index == size) {
            tail.info = setNode.info;
        } else {
            Node q = head.next;
            for (int i = 2; i < index; i++) {
                q = q.next;
            }
            q.info = setNode.info;
        }

    }

    public T clone() {
        MyLinkedList<T> clone = new MyLinkedList<>();
        clone.head = clone.tail = null;
        clone.size = 0;
        for (Node x = head; x != null; x = x.next) {
            clone.addFirst(x.info);
        }
        return (T) clone;
    }

    public void rev() {
        Stack<T> stack = new Stack<T>();
        Node x = head;
        while (x != null) {
            stack.push(x.info);
            x = x.next;
        }
        this.deleteList();
        while (!stack.isEmpty()){
            addLast(stack.pop());
        }
        System.out.println("true");
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