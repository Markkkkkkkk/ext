package pri.Mark.ext.model;

import java.util.Date;

public class Hj {
    private Integer hjId;

    private Integer hjTown;

    private Date hjInputtime;

    private String hjType;

    public Integer getHjId() {
        return hjId;
    }

    public void setHjId(Integer hjId) {
        this.hjId = hjId;
    }

    public Integer getHjTown() {
        return hjTown;
    }

    public void setHjTown(Integer hjTown) {
        this.hjTown = hjTown;
    }

    public Date getHjInputtime() {
        return hjInputtime;
    }

    public void setHjInputtime(Date hjInputtime) {
        this.hjInputtime = hjInputtime;
    }

    public String getHjType() {
        return hjType;
    }

    public void setHjType(String hjType) {
        this.hjType = hjType == null ? null : hjType.trim();
    }
}