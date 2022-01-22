package models;

public class DichVuDiKem {
    private String dichVuDikem;
    private String donVi;
    private double giatien;

    public DichVuDiKem(String dichVuDikem, String donVi, double giatien) {
        this.dichVuDikem = dichVuDikem;
        this.donVi = donVi;
        this.giatien = giatien;
    }

    public String getDichVuDikem() {
        return dichVuDikem;
    }

    public String getDonVi() {
        return donVi;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setDichVuDikem(String dichVuDikem) {
        this.dichVuDikem = dichVuDikem;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    @Override
    public String toString() {
        return "Dich vu Di kem: "+this.dichVuDikem+"\nDon vi: "+this.donVi+"\nGia tien: "+this.giatien;
    }
}
