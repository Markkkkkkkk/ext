package pri.Mark.ext.model;

public class Kslb {
    private Integer kslbId;

    private String kslbType;

    public Integer getKslbId() {
        return kslbId;
    }

    public void setKslbId(Integer kslbId) {
        this.kslbId = kslbId;
    }

    public String getKslbType() {
        return kslbType;
    }

    public void setKslbType(String kslbType) {
        this.kslbType = kslbType == null ? null : kslbType.trim();
    }
}