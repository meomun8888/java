package phuongtien;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("USD","001");
        HangSanXuat h2 = new HangSanXuat("VN","002");
        HangSanXuat h3 = new HangSanXuat("Japan","003");

       Xe x1 = new XeMay(h1,"Xang");
        System.out.println(x1.layTenNhaSanXuat());
        System.out.println(x1.getTenXe());
        x1.batDau();
        System.out.println(x1.km());
        x1.dungLai();
    }
}
