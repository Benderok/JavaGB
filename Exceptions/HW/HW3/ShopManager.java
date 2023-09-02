package Exceptions.HW.HW3;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity)
            throws ProductNotFoundException, InsufficientQuantityException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null) {
            throw new ProductNotFoundException();
        }

        if (product.getAvailableQuantity() < quantity) {
            throw new InsufficientQuantityException();
        }

        double totalPrice = product.getPrice() * quantity;
    
        return totalPrice;
    }
}
class ProductNotFoundException extends Exception {
}

class InsufficientQuantityException extends Exception {
}