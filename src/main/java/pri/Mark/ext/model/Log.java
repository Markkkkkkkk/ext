package pri.Mark.ext.model;

import java.util.Date;

public class Log {
    private Integer logId;

    private Integer logTablename;

    private Date logLandtime;

    private Date logOuttime;

    private String logIp;

    private String logOperatetype;

    private String logBrowser;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getLogTablename() {
        return logTablename;
    }

    public void setLogTablename(Integer logTablename) {
        this.logTablename = logTablename;
    }

    public Date getLogLandtime() {
        return logLandtime;
    }

    public void setLogLandtime(Date logLandtime) {
        this.logLandtime = logLandtime;
    }

    public Date getLogOuttime() {
        return logOuttime;
    }

    public void setLogOuttime(Date logOuttime) {
        this.logOuttime = logOuttime;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp == null ? null : logIp.trim();
    }

    public String getLogOperatetype() {
        return logOperatetype;
    }

    public void setLogOperatetype(String logOperatetype) {
        this.logOperatetype = logOperatetype == null ? null : logOperatetype.trim();
    }

    public String getLogBrowser() {
        return logBrowser;
    }

    public void setLogBrowser(String logBrowser) {
        this.logBrowser = logBrowser == null ? null : logBrowser.trim();
    }
}