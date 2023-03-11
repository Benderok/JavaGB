// 1. Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
// (6, 'a', 'b') -> "ababab"

package Seminars.HomeWork.Seminar_2;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println(buildString(10, 'a', 'b')); // "ababab"
        
    }
    private static StringBuilder buildString(int N, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < N / 2; count++) {
            sb.append(c1).append(c2);
        }
        return sb;
    }
}
