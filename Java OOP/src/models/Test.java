package models;

public class Test {
    public static void main(String[] args) {
        //dich vu di kem
        DichVuDiKem dv1 = new DichVuDiKem("Massage","Null",1000000);
        DichVuDiKem dv2 = new DichVuDiKem("Massage","Null",1000000);
        DichVuDiKem dv3 = new DichVuDiKem("Massage","Null",1000000);

        //class villa
        Villa vl = new Villa("021105","Villa",80,30000000,10,"Nam"
                ,dv1,"Vip 1","khu vui choi",40,10);
        vl.showInfor();

        //class House
        House h = new House("021106","House",40,8000000,4,"Thang",
                dv2,"Vip 2","khu vui choi",20);
        h.showInfor();

        //class room
        Room r = new Room("021107","Room",20,2000000,1,"Ngay",
                dv3,"nuoc loc");
        r.showInfor();

    }
}
