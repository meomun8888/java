package models;

public class House extends Services{
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private int soTang;

    public House(String id, String tenDv, int dienTich, double phiThue, int soLuongNguoi, String kieuThue, DichVuDiKem dichVuDiKem, String tieuChuanPhong, String tienNghiKhac, int soTang) {
        super(id, tenDv, dienTich, phiThue, soLuongNguoi, kieuThue, dichVuDiKem);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    protected void showInfor() {
        System.out.println("\nId: "+this.id);
        System.out.println("Ten dich vu: "+this.tenDv);
        System.out.println("Tien ich: "+this.dienTich);
        System.out.println("Chi Phi: "+this.phiThue+" VND");
        System.out.println("So luong nguoi: "+this.soLuongNguoi);
        System.out.println("Kieu thue : "+this.kieuThue);
        System.out.println(this.dichVuDiKem.toString());
        System.out.println("Tieu chuan phong: "+this.tieuChuanPhong);
        System.out.println("Tien nghi khac: "+this.tienNghiKhac);
        System.out.println("So tang: "+this.soTang);
    }
}
