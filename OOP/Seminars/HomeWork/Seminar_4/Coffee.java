package OOP.Seminars.HomeWork.Seminar_4;

public class Coffee extends Product{
    private String brand;
    private  int roasting;

    public Coffee(String brand, int roasting) {
        this.brand = brand;
        this.roasting = roasting;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRoasting() {
        return roasting;
    }

    public void setRoasting(int roasting) {
        this.roasting = roasting;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "brand='" + brand + '\'' +
                ", roasting=" + roasting +
                '}';
    }
}