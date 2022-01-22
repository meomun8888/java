package computer;

public class Manufacturer {
    private String manufactacturerOfName;
    private Country country;

    public Manufacturer(String manufactacturerOfName, Country country) {
        this.manufactacturerOfName = manufactacturerOfName;
        this.country = country;
    }

    public String getManufactacturerOfName() {
        return manufactacturerOfName;
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setManufactacturerOfName(String manufactacturerOfName) {
        this.manufactacturerOfName = manufactacturerOfName;
    }
}
