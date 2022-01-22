package phuongtien;

public class Xedap extends Xe {
    public Xedap(String tenXe, HangSanXuat hangSanXuat) {
        super(tenXe, hangSanXuat);
    }

    @Override
    protected double km() {
        return 20;
    }
}
