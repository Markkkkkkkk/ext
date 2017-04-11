package pri.Mark.ext.model;

public class Idcard {
    private Integer idcardId;

    private Integer idcardBalance;

    private String idcardNumber;

    public Integer getIdcardId() {
        return idcardId;
    }

    public void setIdcardId(Integer idcardId) {
        this.idcardId = idcardId;
    }

    public Integer getIdcardBalance() {
        return idcardBalance;
    }

    public void setIdcardBalance(Integer idcardBalance) {
        this.idcardBalance = idcardBalance;
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber == null ? null : idcardNumber.trim();
    }
}