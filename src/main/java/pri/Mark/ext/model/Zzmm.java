package pri.Mark.ext.model;

public class Zzmm {
    private Integer zzmmId;

    private String zzmmName;

    public Integer getZzmmId() {
        return zzmmId;
    }

    public void setZzmmId(Integer zzmmId) {
        this.zzmmId = zzmmId;
    }

    public String getZzmmName() {
        return zzmmName;
    }

    public void setZzmmName(String zzmmName) {
        this.zzmmName = zzmmName == null ? null : zzmmName.trim();
    }
}