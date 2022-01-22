package mylinkedlist;

import ooplinkedlist.Person;

public class Test {
    public static void main(String[] args) {
        MyLinkedList ls = new MyLinkedList<>();
        MyLinkedList ls2 = new MyLinkedList<>();
        Person p1 = new Person("Long", "021105", 21);
        Person p2 = new Person("Mai Hoa", "021102", 20);
        Person p3 = null;
        ls.addLast("G");
        ls.addLast("N");
        ls.addLast("O");
        ls.addLast("L");
        ls.addLast("H");
        ls.addLast("N");
        ls.addLast("A");
        ls.addLast("H");
        ls.addLast("T");
        ls.addLast("Y");
        ls.addLast("L");










//        System.out.println(ls.toString() + "\nsize: " + ls.size());
//        System.out.println("first: " + ls.getFist());
//        System.out.println("Last: " + ls.getLast());
//        ls.deleteList();
//        System.out.println(ls.toString() + "\nsize: " + ls.size());
//        System.out.println("first: " + ls.getFist());
//        System.out.println("Last: " + ls.getLast());
        System.out.println(ls.toString());
        ls.rev();
        System.out.println(ls.toString());
        return;
    }
}
