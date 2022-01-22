package algorithm;


public class Sort {


    public void insertionSort(int arrayInt[], int sort) {
        if (sort < 1 || sort > 2) {
            System.out.println("Enter, sort max = 1, sort mix = 2 !");
            return;
        }
        if (sort == 1) {
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = i + 1; j < arrayInt.length; j++) {
                    if (arrayInt[i] > arrayInt[j]) {
                        swap(arrayInt, i, j);
                    }
                }
            }
        } else {
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = i + 1; j < arrayInt.length; j++) {
                    if (arrayInt[i] < arrayInt[j]) {
                        swap(arrayInt, i, j);
                    }
                }
            }
        }
    }

    public void insertionSort(double arrayInt[], int sort) {
        if (sort < 1 || sort > 2) {
            System.out.println("Enter, sort max = 1, sort mix = 2 !");
            return;
        }
        if (sort == 1) {
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = i + 1; j < arrayInt.length; j++) {
                    if (arrayInt[i] > arrayInt[j]) {
                        swap(arrayInt, i, j);
                    }
                }
            }
        } else {
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = i + 1; j < arrayInt.length; j++) {
                    if (arrayInt[i] < arrayInt[j]) {
                        swap(arrayInt, i, j);
                    }
                }
            }
        }
    }

    public void bubbleSort(int[] arrayInt, int sort) {
        if (sort < 1 || sort > 2) {
            System.out.println("Enter, sort max = 1, sort mix = 2 !");
            return;
        }
        if (sort == 1) {
            boolean isCheck;
            for (int i = 0; i < (arrayInt.length - 1); i++) {
                isCheck = false;
                for (int j = (arrayInt.length - 1); j > i; j--) {
                    if (arrayInt[j] <= arrayInt[j - 1]) {
                        swap(arrayInt, j, j - 1);
                        isCheck = true;
                    }
                }
                if (isCheck == false) {
                    break;
                }
            }
        }else {
            boolean isCheck;
            for (int i = 0; i < (arrayInt.length - 1); i++) {
                isCheck = false;
                for (int j = (arrayInt.length - 1); j > i; j--) {
                    if (arrayInt[j] >= arrayInt[j - 1]) {
                        swap(arrayInt, j, j - 1);
                        isCheck = true;
                    }
                }
                if (isCheck == false) {
                    break;
                }
            }
        }
    }

    public void bubbleSort(double[] arrayInt, int sort) {
        if (sort < 1 || sort > 2) {
            System.out.println("Enter, sort max = 1, sort mix = 2 !");
            return;
        }
        if (sort == 1) {
            boolean isCheck;
            for (int i = 0; i < (arrayInt.length - 1); i++) {
                isCheck = false;
                for (int j = (arrayInt.length - 1); j > i; j--) {
                    if (arrayInt[j] <= arrayInt[j - 1]) {
                        swap(arrayInt, j, j - 1);
                        isCheck = true;
                    }
                }
                if (isCheck == false) {
                    break;
                }
            }
        }else {
            boolean isCheck;
            for (int i = 0; i < (arrayInt.length - 1); i++) {
                isCheck = false;
                for (int j = (arrayInt.length - 1); j > i; j--) {
                    if (arrayInt[j] >= arrayInt[j - 1]) {
                        swap(arrayInt, j, j - 1);
                        isCheck = true;
                    }
                }
                if (isCheck == false) {
                    break;
                }
            }
        }
    }

    public void selectionSort(int[] arrayInt) {
        int min;
        for (int i = 0; i <= arrayInt.length - 1; ++i) {
            min = i;
            for (int j = 0; j <= arrayInt.length - 1; ++j) {
                if (arrayInt[min] < arrayInt[j]) {
                    min = j;
                }
                swap(arrayInt, min, i);
            }
        }
    }

    public void selectionSort(double[] arrayDouble) {
        int min;
        for (int i = 0; i <= arrayDouble.length - 1; ++i) {
            min = i;
            for (int j = 0; j <= arrayDouble.length - 1; ++j) {
                if (arrayDouble[min] < arrayDouble[j]) {
                    min = j;
                }
                swap(arrayDouble, min, i);
            }
        }
    }

    public void revo(int[] arrayInt, int begin, int end) {
        int temp;
        while (begin < end) {
            temp = arrayInt[begin];
            arrayInt[begin] = arrayInt[end];
            arrayInt[end] = temp;
            begin++;
            end--;
        }
    }

    private int[] swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    private double[] swap(double array[], int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public void collatz(int n) {
        String s = "";
        int max = n;
        int loop = 1;
        int evenLoop = 0, oddLoop = 0;
        System.out.println("N = " + n);
        while (n != 1) {
            if (n % 2 == 0) {
                s += n + " ";
                n /= 2;
                ++loop;
                ++evenLoop;
            } else {
                s += n + " ";
                n = (n * 3) + 1;
                ++loop;
                ;
                ++oddLoop;
            }
            if (max <= n) {
                max = n;
            }
        }
        System.out.println("Total loop: " + loop);
        System.out.println("Total Even Loop: " + evenLoop);
        System.out.println("Total odd Loop: " + oddLoop);
        System.out.println("Biggest Number: " + max);
        System.out.println("Number Sequence: " + s + "1\n");
    }

}
