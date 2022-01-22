package array.integer;


public class All_Sort {
    // private int a[];

    public void bubbleSort(int a[]) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = a.length-1; j > i; j--) {
                if(a[j] < a[j - 1] )swap(a,j,j-1);
            }
        }
    }

    public void selectionSort(int a[]){
        for(int i = 0;i<a.length - 1;i++){
            int min = i;
            for (int j = i + 1;j<a.length;j++){
                if(a[j] < a[min]){
                    swap(a,i,j);
                }
            }
        }
    }
    private static int[] swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
