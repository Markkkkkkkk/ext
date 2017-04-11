package pri.Mark.ext.model;

public class Identitytype {
    private Integer identitytypeId;

    private String identitytypType;

    public Integer getIdentitytypeId() {
        return identitytypeId;
    }

    public void setIdentitytypeId(Integer identitytypeId) {
        this.identitytypeId = identitytypeId;
    }

    public String getIdentitytypType() {
        return identitytypType;
    }

    public void setIdentitytypType(String identitytypType) {
        this.identitytypType = identitytypType == null ? null : identitytypType.trim();
    }
}