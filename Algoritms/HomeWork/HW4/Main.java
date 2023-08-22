package Algoritms.HomeWork.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) { // Программа читает целочисленные значения из консоли и вставляет их в красно-черное дерево.
        final RedBlackTree tree = new RedBlackTree(); // Создается экземпляр класса.
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) { // Ввод данных.
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");

                } catch (Exception ignored) {
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}