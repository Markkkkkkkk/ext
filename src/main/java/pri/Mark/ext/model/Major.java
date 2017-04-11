package pri.Mark.ext.model;

public class Major {
    private Integer majorId;

    private String majorName;

    private Integer majorYx;

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public Integer getMajorYx() {
        return majorYx;
    }

    public void setMajorYx(Integer majorYx) {
        this.majorYx = majorYx;
    }
}