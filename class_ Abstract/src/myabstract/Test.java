package myabstract;

public class Test {
    public static void main(String[] args) {
        ToaDo a = new ToaDo(1,5);
        ToaDo b = new ToaDo(10,20);
        ToaDo c = new ToaDo(75,20);
        ToaDo d = new ToaDo(11,12);

        Hinh vuong = new Hinhvuong(a,5);
        Hinh tron = new Hinhtron(b,3.14);
        Hinh chuNhat = new HinhChuNhat(c,5,10);
        Hinh cham = new Cham(d);

        System.out.println("Hinh vuong: "+vuong.Dientich());
        System.out.println("Hinh tron: "+tron.Dientich());
        System.out.println("Hinh chu nhat: "+chuNhat.Dientich());
        System.out.println("Hinh cham: "+cham.Dientich());
    }
}
