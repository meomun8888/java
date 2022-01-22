import java.util.Arrays;

public class Array<E> {
    private E[] array;
    private int n;

    public Array(int element) {
        this.array = (E[]) new Object[element];
        this.n = n = 0;
    }

    public Array() {
        this.array = (E[]) new Object[10];
        this.n = 0;
    }

    public void add(E e) {
        if (n == array.length) {
            E[] temp = (E[]) new Object[array.length * 2];
            for (int i = 0; i < n; i++) {
                temp[i] = array[i];
            }
            array = temp.clone();
        }
        array[n] = e;
        n++;
    }

    public void add(E e, int index) {
        if (index < 0 || index > n) {
            System.out.println("Invalid Index");
            return;
        }
        if (n == array.length) {
            E[] temp = (E[]) new Object[array.length * 2];
            for (int i = 0; i < n; i++) {
                if (i < index) {
                    temp[i] = array[i];
                } else if (i == index) {
                    temp[index] = e;
                } else {
                    temp[i] = array[i - 1];
                }
            }
            array = temp.clone();
        } else {
            for (int i = n; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = e;
            n++;
        }
    }

    public E[] clone() {
        E[] temp = (E[]) new Object[array.length];
        temp = array.clone();
        return temp;
    }
    
}
