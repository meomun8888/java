package computer;

public class Country {
    private String countryId;
    private String countryName;

    public Country(String countryId, String countryName) {
        if (countryId == "") {
            System.out.println("country Id cannot be left blank");
        } else {
            this.countryId = countryId;
        }
        if (countryName == "") {
            System.out.println("country name cannot be left blank");
        } else {
            this.countryName = countryName;
        }
    }

    public String getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
