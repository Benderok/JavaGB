package OOP.Seminars.HomeWork.Seminar_1;

public class HotDrink extends Product{
    private Double temperature;
    private Integer size;

    public HotDrink(String name, Integer price, Double temperature, Integer size) {
        super(name, price);
        this.temperature = temperature;
        this.size = size;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Integer getSize() {
        return size;
    }

    public String toString() {
        return String.format(super.toString() + "temperature: " + temperature + ", size: " + size);
    }
}
