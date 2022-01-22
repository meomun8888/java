package mystack;

import java.util.Scanner;

public class Stack_linkedList<E> {

    private class Node<E> {
        private E info;
        public Node<E> next;

        public Node(E e) {
            this.info = e;
            this.next = null;
        }

        public Node(E e, Node x) {
            this.info = e;
            this.next = x;
        }
    }

    private Node top;
    private int size;

    public Stack_linkedList(Node top, int size) {
        this.top = top;
        this.size = size;
    }

    public Stack_linkedList() {
        this.top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size < 1;
    }

    public E push(E e) {
        Node q = new Node(e);
        if (size == 0) {
            this.top = q;
        } else {
            q.next = top;
            top = q;
        }
        size++;
        return (E) top.info;
    }

    public E peek() {
        if (isEmpty() == true) {
            System.out.println("Stack isEmpty !");
            return null;
        }
        return (E) top.info;
    }

    public E pop() {
        if (isEmpty() == true) {
            System.out.println("Stack isEmpty !");
            return null;
        }
        E temp = (E) top.info;
        top.info = null;
        top = top.next;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String s = "";
        Node q = top;
        while (q != null) {
            s += q.info;
            q = q.next;
        }
        return s;
    }
}
