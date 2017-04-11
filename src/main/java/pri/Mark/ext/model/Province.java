package pri.Mark.ext.model;

public class Province {
    private Integer provinceEncoding;

    private String provinceName;

    private Integer provinceCountry;

    public Integer getProvinceEncoding() {
        return provinceEncoding;
    }

    public void setProvinceEncoding(Integer provinceEncoding) {
        this.provinceEncoding = provinceEncoding;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getProvinceCountry() {
        return provinceCountry;
    }

    public void setProvinceCountry(Integer provinceCountry) {
        this.provinceCountry = provinceCountry;
    }
}