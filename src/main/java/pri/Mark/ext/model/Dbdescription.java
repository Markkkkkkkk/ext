package pri.Mark.ext.model;

public class Dbdescription {
    private Integer dbdescriptionId;

    private Integer dbdescriptionZd;

    private String dbdescriptionTablename;

    private String dbdescriptionDescription;

    public Integer getDbdescriptionId() {
        return dbdescriptionId;
    }

    public void setDbdescriptionId(Integer dbdescriptionId) {
        this.dbdescriptionId = dbdescriptionId;
    }

    public Integer getDbdescriptionZd() {
        return dbdescriptionZd;
    }

    public void setDbdescriptionZd(Integer dbdescriptionZd) {
        this.dbdescriptionZd = dbdescriptionZd;
    }

    public String getDbdescriptionTablename() {
        return dbdescriptionTablename;
    }

    public void setDbdescriptionTablename(String dbdescriptionTablename) {
        this.dbdescriptionTablename = dbdescriptionTablename == null ? null : dbdescriptionTablename.trim();
    }

    public String getDbdescriptionDescription() {
        return dbdescriptionDescription;
    }

    public void setDbdescriptionDescription(String dbdescriptionDescription) {
        this.dbdescriptionDescription = dbdescriptionDescription == null ? null : dbdescriptionDescription.trim();
    }
}