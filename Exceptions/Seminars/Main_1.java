package Exceptions.Seminars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// public class Main_1 {
//     public static void main(String[] args) {
//         try {
//             FileInputStream file = new FileInputStream("nonexistent.txt");
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found: " + e.getMessage());
//         }
//     }
// }

public class Main_1 {
    // Метод divide объявляет, что он может сгенерировать ArithmeticException
    public static double divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            // Генерируем исключение в случае деления на ноль
            throw new ArithmeticException("Division by zero");
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            // Вызываем метод divide, который может сгенерировать исключение
            double result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Обрабатываем исключение в вызывающем коде
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}