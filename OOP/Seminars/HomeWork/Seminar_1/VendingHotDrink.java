package OOP.Seminars.HomeWork.Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class VendingHotDrink implements VendingMachine {
    private List<HotDrink> products = new ArrayList<HotDrink>();

    public List<HotDrink> getProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByPrice(Integer price) {
        for (Product product : products) {
            if (product.getPrice() == price) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (product instanceof HotDrink)
            products.add((HotDrink) product);
    }

    HotDrink getProduct(Double temperature) {
        for (HotDrink product : products) {
            if (temperature.equals(product.getTemperature()))
                return (HotDrink) product;
        }
        return null;
    }

    HotDrink getProduct(String name) {
        for (HotDrink product : products) {
            if (name.equals(product.getName())) {
                return (HotDrink) product;
            }
        }
        return null;
    }

    HotDrink getProduct(Integer size) {
        for (HotDrink product : products) {
            if (size.equals(product.getSize()))
                return (HotDrink) product;
        }
        return null;
    }
}
