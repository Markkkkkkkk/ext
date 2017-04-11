package pri.Mark.ext.model;

public class Nation {
    private Integer nationId;

    private String nationName;

    private Integer nationCountry;

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName == null ? null : nationName.trim();
    }

    public Integer getNationCountry() {
        return nationCountry;
    }

    public void setNationCountry(Integer nationCountry) {
        this.nationCountry = nationCountry;
    }
}