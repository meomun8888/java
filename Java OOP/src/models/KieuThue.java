package models;

// TODO: 19/11/2021  chua goi vo class nao het ! 
public class KieuThue {
    private  int nam,thang,ngay,gio;
    
    public KieuThue(int nam, int thang, int ngay, int gio) {
        this.nam = nam;
        this.thang = thang;
        this.ngay = ngay;
        this.gio = gio;
    }

    public int getNam() {
        return nam;
    }

    public int getThang() {
        return thang;
    }

    public int getNgay() {
        return ngay;
    }

    public int getGio() {
        return gio;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return "KieuThue{" +
                "nam=" + nam +
                ", thang=" + thang +
                ", ngay=" + ngay +
                ", gio=" + gio +
                '}';
    }
}
