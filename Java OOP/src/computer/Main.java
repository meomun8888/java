package computer;

public class Main {
    public static void main(String[] args) {
        //class Date
        Date d1 = new Date(11, 12, 2020);
        Date d2 = new Date(11, 12, 2021);
        Date d3 = new Date(11, 12, 2022);

        // class Country
        Country ct1 = new Country("001","USD");
        Country ct2 = new Country("002","JAPAN");
        Country ct3 = new Country("003","HONKON");

        //Manufacturer
        Manufacturer m1 = new Manufacturer("Dell",ct1);
        Manufacturer m2 = new Manufacturer("Ace",ct2);
        Manufacturer m3 = new Manufacturer("Asus",ct3);

        //Computer
        Computer cp1 = new Computer(m1,d1,20000000,18);
        Computer cp2 = new Computer(m2,d2,21000000,12);
        Computer cp3 = new Computer(m3,d3,22000000,12);

//        System.out.println(cp2.checkPrice(cp1));
//        System.out.println(cp1.checkPrice(cp3));
//        System.out.println(cp1.getCountryName());
//
//        cp1.information();
//        cp2.information();
//        cp3.information();

        //List Computer
        ListComputer sv = new ListComputer();
        sv.add(cp1);
        sv.add(cp2);
        System.out.println(sv.toString().toString());
//        sv.add(cp3);
//        sv.outList();

    }
}
