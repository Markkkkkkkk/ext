package pri.Mark.ext.model;

public class Healthstatus {
    private Integer healthstatusId;

    private String healthstatusType;

    public Integer getHealthstatusId() {
        return healthstatusId;
    }

    public void setHealthstatusId(Integer healthstatusId) {
        this.healthstatusId = healthstatusId;
    }

    public String getHealthstatusType() {
        return healthstatusType;
    }

    public void setHealthstatusType(String healthstatusType) {
        this.healthstatusType = healthstatusType == null ? null : healthstatusType.trim();
    }
}