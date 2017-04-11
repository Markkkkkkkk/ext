package pri.Mark.ext.model;

public class Loantype {
    private Integer loantypeId;

    private String loantypeType;

    public Integer getLoantypeId() {
        return loantypeId;
    }

    public void setLoantypeId(Integer loantypeId) {
        this.loantypeId = loantypeId;
    }

    public String getLoantypeType() {
        return loantypeType;
    }

    public void setLoantypeType(String loantypeType) {
        this.loantypeType = loantypeType == null ? null : loantypeType.trim();
    }
}