package pri.Mark.ext.model;

public class Country {
    private Integer countryEncoding;

    private String countryName;

    public Integer getCountryEncoding() {
        return countryEncoding;
    }

    public void setCountryEncoding(Integer countryEncoding) {
        this.countryEncoding = countryEncoding;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }
}