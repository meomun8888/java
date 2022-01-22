package mystack;

public class StackArray<E> {
    private E[] a;
    private int size, top;

    public StackArray() {
        a = (E[]) new Object[10];
        top = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E push(E e) {
        if (a.length == size) {
            System.out.println("Stack full");
            return null;
        }
        top++;
        a[top] = e;
        size++;
        return e;
    }

    public E peek(){
        if (size == 0){
            System.out.println("Stack isEmpty !");
            return null;
        }
        return a[top];
    }

    public E pop(){
        if (size == 0){
            System.out.println("Stack isEmpty !");
            return null;
        }
        E temp = a[top];
        a[top] = null;
        top--;
        size--;
        return temp;
    }

}
