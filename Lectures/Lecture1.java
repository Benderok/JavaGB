package Lectures;

/**
 * Lecture1
 */
import java.util.Scanner;
public class Lecture1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++){
            sb.append("+");
        }
    System.out.println(sb);
    String ad = "Airworth";
    System.out.println(ad.charAt(2));
    System.out.println(ad.indexOf("w"));
    System.out.println(ad.replace("w", "X"));

    }
}