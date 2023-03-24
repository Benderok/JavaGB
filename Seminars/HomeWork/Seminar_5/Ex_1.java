/**
 * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */

package Seminars.HomeWork.Seminar_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ex_1 {
    public static void main(String[] args) {
        
        String text = "Мороз и солнце день чудесный, Еще ты дремлешь друг прелестный, Пора красавица проснись";
        collectStats(text);
        }
    static void collectStats(String text) {
        text = removePunctuations(text);
        String [] words = text.split((" "));
        LinkedList<String> res = new LinkedList<>();
        System.out.println(Arrays.toString(words));
        Map<Integer, List<String>> result = new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                for (String s : words) {
                    if (s.length() == i) {
                        result.put(i, Collections.singletonList(s));
                        if (result.get(i) != null) {
                            res.add(s);
                        }
                        result.put(i, res);
                    }
                }
                res = new LinkedList<>();
            }
        System.out.println(result);
        }

    public static String removePunctuations(String source) {
        return source.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
    }
  }