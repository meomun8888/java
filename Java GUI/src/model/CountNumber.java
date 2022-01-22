package model;

public class CountNumber {
    private int value;

    public CountNumber(int value) {
        this.value = value;
    }

    public CountNumber() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incresment() {
        this.value++;
    }

    public void decrement() {
        this.value--;
    }

    public void reset() {
        this.value = 0;
    }
}
