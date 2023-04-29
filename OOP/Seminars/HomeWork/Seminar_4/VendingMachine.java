package OOP.Seminars.HomeWork.Seminar_4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
    //добавить в список продуктов
    // получать и удалять
    // должен быть отдельный класс
    private List<T> products;

    public VendingMachine() {
        List<T> products = new ArrayList<>();
        this.products=products;
    }


    public void setProducts() {
        this.products = products;
    }
    public void removeProduct(T product){
        this.products.remove(products.indexOf(product));
    }

    public void addProducts(T product){
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
    public void getInfo(){
        for(Product x : products){
            System.out.println(x);
        }
    }
}