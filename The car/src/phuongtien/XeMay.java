package phuongtien;

public class XeMay extends Xe{
    private  String nguyenLieu;

    public XeMay(HangSanXuat hangSanXuat, String nguyenLieu) {
        super("Xe May", hangSanXuat);
        this.nguyenLieu = nguyenLieu;
    }

    @Override
    protected double km() {
        return 60;
    }

}
