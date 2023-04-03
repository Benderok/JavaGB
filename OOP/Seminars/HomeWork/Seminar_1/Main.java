package OOP.Seminars.HomeWork.Seminar_1;

public class Main {
    public static void main(String[] args) throws Exception {
        VendingHotDrink m = new VendingHotDrink();
        m.addProduct(new HotDrink("Black tea", 40, 95.5, 200));
        m.addProduct(new HotDrink("Green tea", 45, 90.1, 210));
        m.addProduct(new HotDrink("Karak tea", 20, 80.2, 120));
        m.addProduct(new HotDrink("Americano", 80, 95.7, 150));
        m.addProduct(new HotDrink("Espresso", 70, 96.5, 50));
        m.addProduct(new HotDrink("Cappuccino", 100, 85.9, 160));
        m.addProduct(new HotDrink("Latte", 110, 88.7, 170));
        m.addProduct(new HotDrink("Flat White", 90, 90.3, 110));
        m.addProduct(new HotDrink("Matcha", 150, 75.7, 210));
        for (Product product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println("-".repeat(60));
        System.out.println(m.getProduct(80.2));
        System.out.println(m.getProduct("Flat White"));
        System.out.println(m.getProduct(210));
    }
}
