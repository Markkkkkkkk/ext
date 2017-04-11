package pri.Mark.ext.model;

import java.util.Date;

public class Studentname {
    private Integer studentnameId;

    private String studentnameName;

    private Date studentnameInputtime;

    public Integer getStudentnameId() {
        return studentnameId;
    }

    public void setStudentnameId(Integer studentnameId) {
        this.studentnameId = studentnameId;
    }

    public String getStudentnameName() {
        return studentnameName;
    }

    public void setStudentnameName(String studentnameName) {
        this.studentnameName = studentnameName == null ? null : studentnameName.trim();
    }

    public Date getStudentnameInputtime() {
        return studentnameInputtime;
    }

    public void setStudentnameInputtime(Date studentnameInputtime) {
        this.studentnameInputtime = studentnameInputtime;
    }
}