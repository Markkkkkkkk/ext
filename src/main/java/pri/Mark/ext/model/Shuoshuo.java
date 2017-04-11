package pri.Mark.ext.model;

import java.util.Date;

public class Shuoshuo {
    private Integer shuoshuoId;

    private Date shuoshuoReleasetime;

    private String shuoshuoPromulgator;

    private String shuoshuoContent;

    public Integer getShuoshuoId() {
        return shuoshuoId;
    }

    public void setShuoshuoId(Integer shuoshuoId) {
        this.shuoshuoId = shuoshuoId;
    }

    public Date getShuoshuoReleasetime() {
        return shuoshuoReleasetime;
    }

    public void setShuoshuoReleasetime(Date shuoshuoReleasetime) {
        this.shuoshuoReleasetime = shuoshuoReleasetime;
    }

    public String getShuoshuoPromulgator() {
        return shuoshuoPromulgator;
    }

    public void setShuoshuoPromulgator(String shuoshuoPromulgator) {
        this.shuoshuoPromulgator = shuoshuoPromulgator == null ? null : shuoshuoPromulgator.trim();
    }

    public String getShuoshuoContent() {
        return shuoshuoContent;
    }

    public void setShuoshuoContent(String shuoshuoContent) {
        this.shuoshuoContent = shuoshuoContent == null ? null : shuoshuoContent.trim();
    }
}