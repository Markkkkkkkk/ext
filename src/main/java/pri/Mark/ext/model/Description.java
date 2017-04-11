package pri.Mark.ext.model;

import java.util.Date;

public class Description {
    private Integer descriptionId;

    private Date descriptionInputtime;

    private String descriptionText;

    public Integer getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(Integer descriptionId) {
        this.descriptionId = descriptionId;
    }

    public Date getDescriptionInputtime() {
        return descriptionInputtime;
    }

    public void setDescriptionInputtime(Date descriptionInputtime) {
        this.descriptionInputtime = descriptionInputtime;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText == null ? null : descriptionText.trim();
    }
}