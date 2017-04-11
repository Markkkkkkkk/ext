package pri.Mark.ext.model;

public class Shuoshuolike {
    private Integer shuoshuolikeId;

    private String shuoshuolikeLiker;

    private Integer shuoshuolikeShuoshuo;

    public Integer getShuoshuolikeId() {
        return shuoshuolikeId;
    }

    public void setShuoshuolikeId(Integer shuoshuolikeId) {
        this.shuoshuolikeId = shuoshuolikeId;
    }

    public String getShuoshuolikeLiker() {
        return shuoshuolikeLiker;
    }

    public void setShuoshuolikeLiker(String shuoshuolikeLiker) {
        this.shuoshuolikeLiker = shuoshuolikeLiker == null ? null : shuoshuolikeLiker.trim();
    }

    public Integer getShuoshuolikeShuoshuo() {
        return shuoshuolikeShuoshuo;
    }

    public void setShuoshuolikeShuoshuo(Integer shuoshuolikeShuoshuo) {
        this.shuoshuolikeShuoshuo = shuoshuolikeShuoshuo;
    }
}