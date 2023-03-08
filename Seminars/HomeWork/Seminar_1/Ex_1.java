package Seminars.HomeWork.Seminar_1;

import java.util.Arrays;

public class Ex_1 {
    public static void main(String[] args) {
        
            System.out.println(isSumBetween10And20(5, 11)); // true
            System.out.println(isSumBetween10And20(7, 15)); // false
        
            System.out.println(isPositive(5)); // true
            System.out.println(isPositive(-3)); // false
        
            printString("abcd", 5); // abcdabcdabcdabcdabcd

            System.out.println(isLeapYear(2023)); // false
            System.out.println(isLeapYear(1924)); // true

            System.out.println(Arrays.toString(createArray(6, 2)));

            int[] arr1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(arrayChange1to0(arr1)));

            int[] arr2 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arrayChangeByMul(arr2)));

            // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
            // и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
            // В методе выполнить не получилось. Не получилось вывести через return двумерный массив и потом вывести его в консоль.
            
            int N = 5;
            int massiv2D[][] = new int[N][N];
            int i, j = 0;
            
            for (i = 0; i < N; i++)
                for (j = 0; j < N; j++) {
                    if (i == j) {
                        massiv2D[i][j] = 1;
                    } else {
                        massiv2D[i][j] = 0;
                    }
                }
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++)
                    System.out.print(massiv2D[i][j] + "  ");
                System.out.println();
            }

    }
        
        
        /**
         * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
         * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
        private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
            if (a + b > 10 && a + b < 21){
                return true;
            }else{
                return false;
            }
        }
        
        private static boolean isPositive(int x) {
        // проверить, что х положительное
            if (x > 0){
                return true;
            }else{
                return false;
            }
        }
        
        private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
            System.out.println(source.repeat(repeat));
        }
        
        private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
            if (year > 1584 && ((year%400 == 0) || year %4 == 0 && year % 100 != 0)){
                return true;
            }else{
                return false;
            }
        }
        
        private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
            int[] arr = new int [len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initalValue;
            }
            return arr;
            }
        
        // Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        private static int[] arrayChange1to0(int[] arr1) {
            for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1){
                arr1[i] = 0;
            }else{
                arr1[i] = 1;
            }
            }
            return arr1;
            }
            
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        private static int[] arrayChangeByMul(int[] arr2) {
            for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6){
                arr2[i] = arr2[i]*2;
            }
            }
            return arr2;
            } 
}   
