// Реализуйте класс Товар, содержащий данные о товаре, и Торговый Автомат,
// содержащий в себе методы getProductsByname и getProductsByPrice

package OOP.Seminars.Seminar_1.Ex_1;

public class Product {
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product name %s, cost %d", name, cost);
    }

    Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

}