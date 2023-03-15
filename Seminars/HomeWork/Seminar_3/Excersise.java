// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

package Seminars.HomeWork.Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Excersise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(54);
        list.add(341);
        list.add(123);
        list.add(345);
        list.add(566);
        list.add(23);
        list.add(48);
        list.add(450);
        list.add(82);
  
        Iterator<Integer> newIterator = list.iterator();
        while(newIterator.hasNext()){
            Integer nextList = newIterator.next();
            if (nextList % 2 != 0){
                newIterator.remove();
            }
        }
        System.out.println(list);
    }
}
