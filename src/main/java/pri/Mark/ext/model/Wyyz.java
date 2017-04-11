package pri.Mark.ext.model;

public class Wyyz {
    private Integer wyyzId;

    private String wyyzName;

    public Integer getWyyzId() {
        return wyyzId;
    }

    public void setWyyzId(Integer wyyzId) {
        this.wyyzId = wyyzId;
    }

    public String getWyyzName() {
        return wyyzName;
    }

    public void setWyyzName(String wyyzName) {
        this.wyyzName = wyyzName == null ? null : wyyzName.trim();
    }
}