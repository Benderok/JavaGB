/*Создайте иерархию классов для интернет-магазина, как в примере .
Реализуйте методы для обработки покупок и доступа к данным о продуктах.
Добавьте исключения на каждый уровень абстракции для обработки возможных ошибок,
например, если товар не найден. */

package Exceptions.HW.HW3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        try {
            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Total price: $" + totalPrice);
        } catch (ProductNotFoundException e) {
            System.out.println("Product not found!");
        } catch (InsufficientQuantityException e) {
            System.out.println("Insufficient quantity of the available products.");
        }
        finally {
            scanner.close();
        }
}
}