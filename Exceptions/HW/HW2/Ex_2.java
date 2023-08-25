/* Напишите программу, которая запрашивает у пользователя два числа
и выполняет их деление. Если второе число равно нулю,
программа должна выбрасывать исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо". В противном случае,
программа должна выводить результат деления. */

package Exceptions.HW.HW2;

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число 1: ");
            double a = scanner.nextDouble();
            System.out.print("Введите число 2: ");
            double b = scanner.nextDouble();

            if (b == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } else {
                System.out.println(a/b);
            }
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Вы ввели не число!");
        } finally {
            scanner.close();
        }
    }
}
