package MyArraylistStudent;

public class MyArrayList<T> {
    private T[] value;
    private int n;

    public MyArrayList() {
        value = (T[]) new Object[10];
        n = 0;
    }

    public int length() {
        return value.length;
    }
//    public MyArrayList(int element) {
//        value = (T[]) new Object[element];
//        n = 0;
//    }

    public void add(T e) {
        if (n == value.length) {
            T[] temp = (T[]) new Object[value.length * 2];
            for (int i = 0; i < n; i++) {
                temp[i] = value[i];
            }
            value = temp.clone();
        }
        value[n] = e;
        n++;
    }

    public void add(int index, T e) {
        if (index < 0 || index > n) {
            System.out.println("Invalid Index ");
            return;
        } else {
            if (n == value.length) {
                T[] temp = (T[]) new Object[value.length * 2];
                for (int i = 0; i < n; i++) {
                    if (i < index) {
                        temp[i] = value[i];
                    } else if (i == index) {
                        temp[i] = e;
                    } else {
                        temp[i] = value[i - 1];
                    }
                }
                value = temp;
            } else {
                for (int i = n; i > index; i--) {
                    value[i] = value[i - 1];
                }
                value[index] = e;
                n++;
            }
        }
    }

    public int size() {
        if (n == 0) {
            return -1;
        }
        return n;
    }

    public void remove(int index) {
        if (index < 0 || index > n) {
            System.out.println("Invalid Index !");
            ;
        } else {
            for (int i = index + 1; i < n; i++) {
                value[i - 1] = value[i];
            }
            n--;
        }
    }


    public T get(int index) {
        if (index < 0 || index > n) {
            System.out.println("Invalid Index");
            return null;
        } else if (this.size() == 0) {
            return null;
        }
        return value[index];
    }

    public void set(int index, T e) {
        if (index < 0 || index > n) {
            System.out.println("Invalid Index !");
            return;
        } else {
            value[index] = e;
        }
    }

//    public void sort() {
//        for (int i = 0; i < value.length - 1; i++) {
//            for (int j = value.length - 1; j > i; j--)
//                if (value[j] > value[j - 1]) {
//                    swap(value, j, j - 1);
//                }
//        }
//    }
    private T[] swap(T[] e, int i, int j){
        T temp = e[i];
        e[i] = e[j];
        e[j] = temp;
        return e;
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += value[i] + " ";
        }
        return s;
    }
}
