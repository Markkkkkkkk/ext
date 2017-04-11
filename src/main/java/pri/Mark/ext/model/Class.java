package pri.Mark.ext.model;

public class Class {
    private Integer classId;

    private String className;

    private Integer classMajor;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(Integer classMajor) {
        this.classMajor = classMajor;
    }
}