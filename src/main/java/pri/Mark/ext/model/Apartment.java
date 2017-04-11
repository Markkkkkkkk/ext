package pri.Mark.ext.model;

public class Apartment {
    private Integer apartmentId;

    private Integer apartmentYx;

    private String apartmentName;

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getApartmentYx() {
        return apartmentYx;
    }

    public void setApartmentYx(Integer apartmentYx) {
        this.apartmentYx = apartmentYx;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName == null ? null : apartmentName.trim();
    }
}