package array.integer;

import java.util.Arrays;

public class My_Array_Of_Integer {
    private int a[];
    private int n;

    public My_Array_Of_Integer(){
        a = new int[10];
        n = 0;
    }
    public My_Array_Of_Integer(int element){
        a = new int[element];
        n = 0;
    }

    public void add(int x){
        if(n == a.length){
            int b[] = new int[a.length * 2];
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
            }
            a = b.clone();
        }
        a[n] = x;
        n++;
    }
    public void add(int x, int index){
        if(index < 0 || index > n){
            System.out.println("Invalid index");
        }else {
            if(n == a.length){
                int b[] = new int[a.length*2];
                for (int i = 0; i< n;i++){
                    if(i < index){
                        b[i] = a[i];
                    }else if(i == index){
                        b[i] = x;
                    }else {
                        b[i] = a[i - 1];
                    }
                }
                a = b;
            }else {
                for (int i = n; i > index ; i--) {
                    a[i] = a[i - 1];
                }
                a[index] = x;
            }
            n++;
        }
    }
    public String toString(){
        String s = "";
        for (int i = 0; i < n; i++) {
            s += a[i] + " ";
        }
        return s;
    }


}

