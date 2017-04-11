package pri.Mark.ext.model;

public class City {
    private Integer cityEncoding;

    private String cityName;

    private Integer cityProvince;

    public Integer getCityEncoding() {
        return cityEncoding;
    }

    public void setCityEncoding(Integer cityEncoding) {
        this.cityEncoding = cityEncoding;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getCityProvince() {
        return cityProvince;
    }

    public void setCityProvince(Integer cityProvince) {
        this.cityProvince = cityProvince;
    }
}