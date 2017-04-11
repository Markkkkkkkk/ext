package pri.Mark.ext.model;

import java.util.Date;

public class Identity {
    private String identityId;

    private String identityNumber;

    private Integer identityType;

    private Date identityApplytime;

    private Date identityEndtime;

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId == null ? null : identityId.trim();
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public Date getIdentityApplytime() {
        return identityApplytime;
    }

    public void setIdentityApplytime(Date identityApplytime) {
        this.identityApplytime = identityApplytime;
    }

    public Date getIdentityEndtime() {
        return identityEndtime;
    }

    public void setIdentityEndtime(Date identityEndtime) {
        this.identityEndtime = identityEndtime;
    }
}