//     Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида text~num

// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке.
// 3. Если введено exit, завершаем программу

// Пример:
// string~4
// num~3
// print~3
// > num
// print~4
// > string
// my_value~1
// print~1
// > my_value

package Seminars.HomeWork.Seminar_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_1 {
    static List<String> listing = new ArrayList<String>();
    public static void main(String[] args) {
        String input = "";
        Scanner iScanner = new Scanner(System.in);
        while (!input.equals("exit")) {
            input = iScanner.nextLine();
            String[] set = input.split("~");
            if (set.length == 2) {
                try {
                    Integer index = Integer.parseInt(set[1]);
                    if (set[0].equals("print")) {
                        System.out.println(listing.get(index));
                    } else {
                        while (listing.size() < index + 1)
                            listing.add(null);
                        listing.set(index, set[0]);
                    }

                } catch (NumberFormatException e) {
                    System.out.println(String.format("Error:%s", e.getMessage()));
                }
            }
        }
        iScanner.close();
    }   
}
