package pri.Mark.ext.model;

import java.util.Date;

public class Xf {
    private Integer xfId;

    private String xfYhkh;

    private Date xfSubmittime;

    private String xfAmount;

    public Integer getXfId() {
        return xfId;
    }

    public void setXfId(Integer xfId) {
        this.xfId = xfId;
    }

    public String getXfYhkh() {
        return xfYhkh;
    }

    public void setXfYhkh(String xfYhkh) {
        this.xfYhkh = xfYhkh == null ? null : xfYhkh.trim();
    }

    public Date getXfSubmittime() {
        return xfSubmittime;
    }

    public void setXfSubmittime(Date xfSubmittime) {
        this.xfSubmittime = xfSubmittime;
    }

    public String getXfAmount() {
        return xfAmount;
    }

    public void setXfAmount(String xfAmount) {
        this.xfAmount = xfAmount == null ? null : xfAmount.trim();
    }
}