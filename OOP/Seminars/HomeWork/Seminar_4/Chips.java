package OOP.Seminars.HomeWork.Seminar_4;

public class Chips extends Product{
    private int weight;
    private String taste;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Chips(int weight, String taste) {
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "weight=" + weight +
                ", taste='" + taste + '\'' +
                '}';
    }
}