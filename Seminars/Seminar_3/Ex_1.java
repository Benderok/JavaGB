package Seminars.Seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Ex_1 {
    private static void removeDuplicates(List<Integer> source) {
        // нужно удалить в нем все дубликаты
    
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);
            if (!duplicates.contains(element)) {
                duplicates.add(element);
            } else {
                source.remove(i--);
            }
            i++;
        }

//         int i = 0;
// while (i < source.size()) {
//     int j = i + 1;
//     while (j < source.size()) {
//         if (source.get(i).equals(source.get(j))) {
//             source.remove(j);
//         }
//         j++;
//     }
//     i++;
// }
    }
}
