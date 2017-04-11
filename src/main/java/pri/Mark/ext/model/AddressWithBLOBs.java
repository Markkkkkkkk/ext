package pri.Mark.ext.model;

public class AddressWithBLOBs extends Address {
    private String addressJtdz;

    private String addressNowaddressdescription;

    public String getAddressJtdz() {
        return addressJtdz;
    }

    public void setAddressJtdz(String addressJtdz) {
        this.addressJtdz = addressJtdz == null ? null : addressJtdz.trim();
    }

    public String getAddressNowaddressdescription() {
        return addressNowaddressdescription;
    }

    public void setAddressNowaddressdescription(String addressNowaddressdescription) {
        this.addressNowaddressdescription = addressNowaddressdescription == null ? null : addressNowaddressdescription.trim();
    }
}