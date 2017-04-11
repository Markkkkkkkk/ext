package pri.Mark.ext.model;

import java.util.Date;

public class Shuoshuocomment {
    private Integer shuoshuocommentId;

    private Date shuoshuocommentReleasetime;

    private Integer shuoshuocommentPromulgator;

    private Integer shuoshuocommentcolPreviouscomment;

    private String shuoshuocommentContent;

    public Integer getShuoshuocommentId() {
        return shuoshuocommentId;
    }

    public void setShuoshuocommentId(Integer shuoshuocommentId) {
        this.shuoshuocommentId = shuoshuocommentId;
    }

    public Date getShuoshuocommentReleasetime() {
        return shuoshuocommentReleasetime;
    }

    public void setShuoshuocommentReleasetime(Date shuoshuocommentReleasetime) {
        this.shuoshuocommentReleasetime = shuoshuocommentReleasetime;
    }

    public Integer getShuoshuocommentPromulgator() {
        return shuoshuocommentPromulgator;
    }

    public void setShuoshuocommentPromulgator(Integer shuoshuocommentPromulgator) {
        this.shuoshuocommentPromulgator = shuoshuocommentPromulgator;
    }

    public Integer getShuoshuocommentcolPreviouscomment() {
        return shuoshuocommentcolPreviouscomment;
    }

    public void setShuoshuocommentcolPreviouscomment(Integer shuoshuocommentcolPreviouscomment) {
        this.shuoshuocommentcolPreviouscomment = shuoshuocommentcolPreviouscomment;
    }

    public String getShuoshuocommentContent() {
        return shuoshuocommentContent;
    }

    public void setShuoshuocommentContent(String shuoshuocommentContent) {
        this.shuoshuocommentContent = shuoshuocommentContent == null ? null : shuoshuocommentContent.trim();
    }
}