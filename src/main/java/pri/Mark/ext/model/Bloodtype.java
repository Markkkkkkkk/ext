package pri.Mark.ext.model;

public class Bloodtype {
    private Integer bloodtypeId;

    private String bloodtypeType;

    public Integer getBloodtypeId() {
        return bloodtypeId;
    }

    public void setBloodtypeId(Integer bloodtypeId) {
        this.bloodtypeId = bloodtypeId;
    }

    public String getBloodtypeType() {
        return bloodtypeType;
    }

    public void setBloodtypeType(String bloodtypeType) {
        this.bloodtypeType = bloodtypeType == null ? null : bloodtypeType.trim();
    }
}