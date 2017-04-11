package pri.Mark.ext.model;

public class Religion {
    private Integer religionId;

    private String religionName;

    public Integer getReligionId() {
        return religionId;
    }

    public void setReligionId(Integer religionId) {
        this.religionId = religionId;
    }

    public String getReligionName() {
        return religionName;
    }

    public void setReligionName(String religionName) {
        this.religionName = religionName == null ? null : religionName.trim();
    }
}