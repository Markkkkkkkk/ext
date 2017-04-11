package pri.Mark.ext.model;

public class LogWithBLOBs extends Log {
    private String logOldvalue;

    private String logNewvalue;

    public String getLogOldvalue() {
        return logOldvalue;
    }

    public void setLogOldvalue(String logOldvalue) {
        this.logOldvalue = logOldvalue == null ? null : logOldvalue.trim();
    }

    public String getLogNewvalue() {
        return logNewvalue;
    }

    public void setLogNewvalue(String logNewvalue) {
        this.logNewvalue = logNewvalue == null ? null : logNewvalue.trim();
    }
}