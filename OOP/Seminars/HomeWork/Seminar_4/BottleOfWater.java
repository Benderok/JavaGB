package OOP.Seminars.HomeWork.Seminar_4;

public class BottleOfWater extends Product {
    private String type;
    private int volume;

    public BottleOfWater(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
}