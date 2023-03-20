package Seminars.Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println(isMatches("foo", "bar"));
        System.out.println(isMatches("paper", "title"));
        System.out.println(isMatches("egg", "add"));
        System.out.println(isMatches("abcde", "abcde"));
    }

    /**
     * Проверить, что 2 строки являются изоморфными в том смысле, что одну букву в первом слове можно заменить на какую-то во втором.
     * Изоморфные строки имеют одинаковую длину.
     * Примеры:
     * (foo, bar) -> false f -> b, o -> a
     * (paper, title) -> true p -> t, a -> i, e -> l, r -> e
     * (egg, add) -> true e -> a, g -> d
     * (abcde, bcdef) -> true a -> b, b -> c, c -> d, d -> e, e -> f
     */
    static boolean isMatches(String s1, String s2) {
        Map<Character, Character> dict = new HashMap<>();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (chars2.length != chars1.length){
            return false;
        }
        for (int i = 0; i < chars1.length; i++) {
            if(dict.containsKey(chars1[i])){
                Character characterValue = dict.get(chars1[i]);
                if(characterValue != chars2[i]){
                    return  false;
                }
            }
            dict.put(chars1[i], chars2[i]);
        }
        return true;
    }
}