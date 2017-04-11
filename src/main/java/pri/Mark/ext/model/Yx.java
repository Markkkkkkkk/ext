package pri.Mark.ext.model;

public class Yx {
    private Integer yxId;

    private String yxName;

    private Integer yxXq;

    public Integer getYxId() {
        return yxId;
    }

    public void setYxId(Integer yxId) {
        this.yxId = yxId;
    }

    public String getYxName() {
        return yxName;
    }

    public void setYxName(String yxName) {
        this.yxName = yxName == null ? null : yxName.trim();
    }

    public Integer getYxXq() {
        return yxXq;
    }

    public void setYxXq(Integer yxXq) {
        this.yxXq = yxXq;
    }
}