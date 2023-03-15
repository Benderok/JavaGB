// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]

package Seminars.HomeWork.Seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Excersise_2 {
    public static void main(String[] args) {
        ArrayList<String> symbols = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        checkForNums(symbols);
        System.out.println(symbols);
    }
    static void checkForNums(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            try {
                Integer.parseInt(arr.get(i));
                arr.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }
}
}