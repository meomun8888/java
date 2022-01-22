package meo;

// TODO: 29/10/2021 kế thừa lớp Math và hiện thực lại cách phương thức của 2 interface MyCaculator, Sort
public class CasioFx580vn extends Math implements MyCaculator, Sort {

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a * b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a / b;
    }

    @Override
    public void sortMin(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    @Override
    public void sortMax(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] >= arr[j - 1]) swap(arr, j, j - 1);
            }
        }
    }

    private double[] swap(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
