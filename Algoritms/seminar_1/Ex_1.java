package Algoritms.seminar_1;

public class Ex_1 {
    public static void main(String[] args) {
        int N = 100; // Здесь замените 100 на нужное вам значение N

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Сумма всех чисел от 1 до " + N + " равна: " + sum);
    }
}