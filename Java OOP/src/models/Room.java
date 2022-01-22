package models;

public class Room extends Services{
    private String dichVuMienPhiDiKem;

    public Room(String id, String tenDv, int dienTich, double phiThue, int soLuongNguoi, String kieuThue, DichVuDiKem dichVuDiKem, String dichVuMienPhiDiKem) {
        super(id, tenDv, dienTich, phiThue, soLuongNguoi, kieuThue, dichVuDiKem);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
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
        System.out.println("Dich Vu Mien Phi Di kem: "+this.dichVuMienPhiDiKem);
    }
}
