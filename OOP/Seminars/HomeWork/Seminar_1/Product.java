package OOP.Seminars.HomeWork.Seminar_1;

public abstract class Product {
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String toString() {
        return String.format("Product name: %s, price: %d, ", name, price);
    }
}
