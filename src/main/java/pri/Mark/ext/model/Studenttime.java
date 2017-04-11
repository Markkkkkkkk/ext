package pri.Mark.ext.model;

import java.util.Date;

public class Studenttime {
    private Integer studenttimeId;

    private Date studenttimeBirthday;

    private String studenttimeRxsj;

    private Date studenttimeRegister;

    private Date studenttimeExpectregister;

    public Integer getStudenttimeId() {
        return studenttimeId;
    }

    public void setStudenttimeId(Integer studenttimeId) {
        this.studenttimeId = studenttimeId;
    }

    public Date getStudenttimeBirthday() {
        return studenttimeBirthday;
    }

    public void setStudenttimeBirthday(Date studenttimeBirthday) {
        this.studenttimeBirthday = studenttimeBirthday;
    }

    public String getStudenttimeRxsj() {
        return studenttimeRxsj;
    }

    public void setStudenttimeRxsj(String studenttimeRxsj) {
        this.studenttimeRxsj = studenttimeRxsj == null ? null : studenttimeRxsj.trim();
    }

    public Date getStudenttimeRegister() {
        return studenttimeRegister;
    }

    public void setStudenttimeRegister(Date studenttimeRegister) {
        this.studenttimeRegister = studenttimeRegister;
    }

    public Date getStudenttimeExpectregister() {
        return studenttimeExpectregister;
    }

    public void setStudenttimeExpectregister(Date studenttimeExpectregister) {
        this.studenttimeExpectregister = studenttimeExpectregister;
    }
}