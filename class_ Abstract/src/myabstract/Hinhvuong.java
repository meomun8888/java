package myabstract;

public class Hinhvuong extends Hinh{
    private int a;
    public Hinhvuong(ToaDo toaDo, int a) {
        super(toaDo);
        this.a = a;
    }


    @Override
    public double Dientich() {
        return a * 4;
    }
}
