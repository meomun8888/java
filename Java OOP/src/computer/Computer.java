package computer;

import java.util.Scanner;

public class Computer {
    private Manufacturer manufacturer; // nha san xuat
    private Date date; // ngay san xuat
    private double price; // gia ban
    private int timeOfInsurance;

    public Computer(){
//        this.manufacturer = null;
//        this.date = null;
//        this.price = 0;
//        this.timeOfInsurance = 0;
    }
    public Computer(Manufacturer manufacturer,Date date, double price,int timeOfInsurance){
        this.manufacturer = manufacturer;
        this.date = date;
        this.price  = price;
        this.timeOfInsurance = timeOfInsurance;
    }
    //check price
    public Boolean checkPrice(Computer cp){
        return this.price > cp.price;
    }
    //getCountryName
    public String getCountryName(){
        return this.manufacturer.getCountry().getCountryName();
    }
    public void information(){
        System.out.println("Name: "+this.manufacturer.getManufactacturerOfName());
        System.out.println("CountryId: "+this.manufacturer.getCountry().getCountryId());
        System.out.println("Country: "+this.manufacturer.getCountry().getCountryName());
        System.out.println("Date of Manufacturer: "+this.date.toString());
        System.out.println("Price: "+this.price);
        System.out.println("Time of insurance: "+this.timeOfInsurance);
    }
    @Override
    public String toString() {
        return "Manufacturer: "+this.manufacturer.getManufactacturerOfName()+
                ", CountryId: "+this.manufacturer.getCountry().getCountryId()+
                ", CountryName: "+this.manufacturer.getCountry().getCountryName()+
                ", Date of Manufacturer: "+this.date.toString()+
                ", Price: "+this.price+", Time of insurance: "+this.timeOfInsurance;
    }
    public  void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hãng sản xuất: ");
        manufacturer.setManufactacturerOfName(sc.nextLine());
        System.out.println("Nhập mã quốc gia: ");
        manufacturer.getCountry().setCountryId(sc.nextLine());
        System.out.println("Nhập tên quốc gia: ");
        manufacturer.getCountry().setCountryName(sc.nextLine());

    }
}
