package phuongtien;

public abstract class Xe {
    protected String tenXe;
    protected HangSanXuat hangSanXuat;

    public Xe(String tenXe, HangSanXuat hangSanXuat) {
        this.tenXe = tenXe;
        this.hangSanXuat = hangSanXuat;
    }
    public String layTenNhaSanXuat(){
        return this.hangSanXuat.getName();
    }

    public void batDau(){
        System.out.println("0");
    }
    public void dungLai(){
        System.out.println("Kit");
    }
    protected abstract double km();

    public String getTenXe() {
        return tenXe;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
}
