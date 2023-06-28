package OOP.Seminars.HomeWork.Seminar_6.controller;

import java.util.List;
import java.util.Map;
import OOP.Seminars.HomeWork.Seminar_6.service.VendingMachineImpl;

public class VendingMachineController {
    private VendingMachineImpl vendingMachineService = new VendingMachineImpl();

    public void addProduct(String productType, Map<String, Object> productData) {
        if (vendingMachineService.getProductTypes().contains(productType)) {
            vendingMachineService.addProduct(productType, productData);
        }
    }

    public List<String> getPpriceList() {
        return vendingMachineService.getProductPriceList();
    }

    public List<String> getProductByMatchPattern(Map<String, Object> matchPattern) {
        return vendingMachineService.getProducts(matchPattern);
    }
}