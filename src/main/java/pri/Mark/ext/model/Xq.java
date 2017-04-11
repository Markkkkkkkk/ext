package pri.Mark.ext.model;

public class Xq {
    private Integer xqId;

    private String xqName;

    public Integer getXqId() {
        return xqId;
    }

    public void setXqId(Integer xqId) {
        this.xqId = xqId;
    }

    public String getXqName() {
        return xqName;
    }

    public void setXqName(String xqName) {
        this.xqName = xqName == null ? null : xqName.trim();
    }
}