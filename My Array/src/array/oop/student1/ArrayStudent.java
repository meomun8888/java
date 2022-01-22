package array.oop.student1;

public class ArrayStudent {
    private Student []sv;
    private int n;

    public ArrayStudent(Student[] sv, int n) {
        this.sv = sv;
        this.n = n;
    }

    public Student[] getSv() {
        return sv;
    }

    public void setSv(Student[] sv) {
        this.sv = sv;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
