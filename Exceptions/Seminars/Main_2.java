package Exceptions.Seminars;

// public class Main_2 {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3};
//         int result = numbers[5]; // Выход за пределы массива
//     }
// }

public class Main_2 {
    public static double divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            double result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}