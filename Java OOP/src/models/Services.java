package models;

public abstract class Services {
    protected String id;
    protected String tenDv;
    protected int dienTich;
    protected double phiThue;
    protected int soLuongNguoi;
    protected String kieuThue;
    protected DichVuDiKem dichVuDiKem;

    public Services(String id, String tenDv, int dienTich, double phiThue, int soLuongNguoi, String kieuThue, DichVuDiKem dichVuDiKem) {
        this.id = id;
        this.tenDv = tenDv;
        this.dienTich = dienTich;
        this.phiThue = phiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getId() {
        return id;
    }

    public String getTenDv() {
        return tenDv;
    }

    public int getDienTich() {
        return dienTich;
    }

    public double getPhiThue() {
        return phiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTenDv(String tenDv) {
        this.tenDv = tenDv;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public void setPhiThue(double phiThue) {
        this.phiThue = phiThue;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    protected abstract void showInfor();
}
