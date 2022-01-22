package algorithm;

public class Search {

    public boolean searchBinary(int[] arrayInt, int x) {
        int l = 0, r = arrayInt.length - 1;
        int m;
        while (l <= r) {
            if (x < arrayInt[l] || x > arrayInt[r]) {
                return false;
            }
            m = (int) (l + (x - arrayInt[l]) * (r - l) / (arrayInt[r] - arrayInt[l]));
            if (arrayInt[m] == x) {
                System.out.println("Location: " + m);
                return true;
            } else {
                if (arrayInt[m] > x) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return false;
    }
}
