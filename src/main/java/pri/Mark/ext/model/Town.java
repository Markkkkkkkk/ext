package pri.Mark.ext.model;

public class Town {
    private Integer townEncoding;

    private String townName;

    private Integer townCity;

    public Integer getTownEncoding() {
        return townEncoding;
    }

    public void setTownEncoding(Integer townEncoding) {
        this.townEncoding = townEncoding;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    public Integer getTownCity() {
        return townCity;
    }

    public void setTownCity(Integer townCity) {
        this.townCity = townCity;
    }
}