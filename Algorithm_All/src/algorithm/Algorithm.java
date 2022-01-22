package algorithm;

public class Algorithm {

    // dảo mảng k lần cach 1, big O(Kn)
    public void loopK(long[] a, int k) {
        long temp;
        for (int i = 0; i < k; ++i) {
            temp = a[0];
            for (int j = 0; j < a.length - 1; ++j) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = temp;
        }
    }

    // Đảo Mảng K lần cách 2, T(n) = O(max(k,n-k,n)) = O(n)
    private void rev(long[] array, int i, int j) {
        long temp;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    public void solution(long []array,int k) {
        rev(array,0,k-1);
        rev(array,k,array.length-1);
        rev(array,0,array.length-1);
    }
}
