package phuongtien;

public class Maybay extends Xe{
    private String nguyenLieu;


    public Maybay(String tenXe, HangSanXuat hangSanXuat, String nguyenLieu) {
        super(tenXe, hangSanXuat);
        this.nguyenLieu = nguyenLieu;
    }

    @Override
    protected double km() {
        return 1000;
    }
}
