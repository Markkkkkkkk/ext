package pri.Mark.ext.model;

public class Highschool {
    private Integer highschoolId;

    private String highschoolName;

    private Integer highschoolTown;

    public Integer getHighschoolId() {
        return highschoolId;
    }

    public void setHighschoolId(Integer highschoolId) {
        this.highschoolId = highschoolId;
    }

    public String getHighschoolName() {
        return highschoolName;
    }

    public void setHighschoolName(String highschoolName) {
        this.highschoolName = highschoolName == null ? null : highschoolName.trim();
    }

    public Integer getHighschoolTown() {
        return highschoolTown;
    }

    public void setHighschoolTown(Integer highschoolTown) {
        this.highschoolTown = highschoolTown;
    }
}