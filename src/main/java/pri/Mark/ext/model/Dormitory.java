package pri.Mark.ext.model;

public class Dormitory {
    private Integer dormitroyId;

    private String dormitoryName;

    private Integer dormitoryApartment;

    public Integer getDormitroyId() {
        return dormitroyId;
    }

    public void setDormitroyId(Integer dormitroyId) {
        this.dormitroyId = dormitroyId;
    }

    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName == null ? null : dormitoryName.trim();
    }

    public Integer getDormitoryApartment() {
        return dormitoryApartment;
    }

    public void setDormitoryApartment(Integer dormitoryApartment) {
        this.dormitoryApartment = dormitoryApartment;
    }
}