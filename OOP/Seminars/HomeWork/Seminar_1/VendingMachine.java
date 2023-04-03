package OOP.Seminars.HomeWork.Seminar_1;

public interface VendingMachine {
    Product getProductByName(String name);

    Product getProductByPrice(Integer price);

    void addProduct(Product product);
}
