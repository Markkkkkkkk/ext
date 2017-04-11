package pri.Mark.ext.model;

public class Tabdescription {
    private Integer tabdescriptionId;

    private String tabdescriptionZdname;

    private String tabdescriptionDescription;

    public Integer getTabdescriptionId() {
        return tabdescriptionId;
    }

    public void setTabdescriptionId(Integer tabdescriptionId) {
        this.tabdescriptionId = tabdescriptionId;
    }

    public String getTabdescriptionZdname() {
        return tabdescriptionZdname;
    }

    public void setTabdescriptionZdname(String tabdescriptionZdname) {
        this.tabdescriptionZdname = tabdescriptionZdname == null ? null : tabdescriptionZdname.trim();
    }

    public String getTabdescriptionDescription() {
        return tabdescriptionDescription;
    }

    public void setTabdescriptionDescription(String tabdescriptionDescription) {
        this.tabdescriptionDescription = tabdescriptionDescription == null ? null : tabdescriptionDescription.trim();
    }
}