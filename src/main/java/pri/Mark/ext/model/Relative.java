package pri.Mark.ext.model;

public class Relative {
    private Integer relativeId;

    private String relativeRelation;

    private String relativeName;

    private Integer relativeDescription;

    private Integer relativeNation;

    private String relativeGzdw;

    private Integer relativeAddress;

    private String relativePhone;

    private String relativeIdentity;

    private String relativeDuty;

    private Integer relativeBloodtype;

    private Integer relativeHealthstatus;

    public Integer getRelativeId() {
        return relativeId;
    }

    public void setRelativeId(Integer relativeId) {
        this.relativeId = relativeId;
    }

    public String getRelativeRelation() {
        return relativeRelation;
    }

    public void setRelativeRelation(String relativeRelation) {
        this.relativeRelation = relativeRelation == null ? null : relativeRelation.trim();
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName == null ? null : relativeName.trim();
    }

    public Integer getRelativeDescription() {
        return relativeDescription;
    }

    public void setRelativeDescription(Integer relativeDescription) {
        this.relativeDescription = relativeDescription;
    }

    public Integer getRelativeNation() {
        return relativeNation;
    }

    public void setRelativeNation(Integer relativeNation) {
        this.relativeNation = relativeNation;
    }

    public String getRelativeGzdw() {
        return relativeGzdw;
    }

    public void setRelativeGzdw(String relativeGzdw) {
        this.relativeGzdw = relativeGzdw == null ? null : relativeGzdw.trim();
    }

    public Integer getRelativeAddress() {
        return relativeAddress;
    }

    public void setRelativeAddress(Integer relativeAddress) {
        this.relativeAddress = relativeAddress;
    }

    public String getRelativePhone() {
        return relativePhone;
    }

    public void setRelativePhone(String relativePhone) {
        this.relativePhone = relativePhone == null ? null : relativePhone.trim();
    }

    public String getRelativeIdentity() {
        return relativeIdentity;
    }

    public void setRelativeIdentity(String relativeIdentity) {
        this.relativeIdentity = relativeIdentity == null ? null : relativeIdentity.trim();
    }

    public String getRelativeDuty() {
        return relativeDuty;
    }

    public void setRelativeDuty(String relativeDuty) {
        this.relativeDuty = relativeDuty == null ? null : relativeDuty.trim();
    }

    public Integer getRelativeBloodtype() {
        return relativeBloodtype;
    }

    public void setRelativeBloodtype(Integer relativeBloodtype) {
        this.relativeBloodtype = relativeBloodtype;
    }

    public Integer getRelativeHealthstatus() {
        return relativeHealthstatus;
    }

    public void setRelativeHealthstatus(Integer relativeHealthstatus) {
        this.relativeHealthstatus = relativeHealthstatus;
    }
}