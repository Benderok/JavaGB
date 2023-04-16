package OOP.Seminars.HomeWork.Seminar_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.print("Input the first number: ");
                double firstDigit = scan.nextDouble();
                System.out.print("Input operation sign: ");
                String symbol = scan.next();
                System.out.print("Input the second number: ");
                double secondDigit = scan.nextDouble();

                OpsSelect calc = new OpsSelect(firstDigit, secondDigit, symbol);
                System.out.println(calc.operation(symbol));
                System.out.println("Do you want continue? Type NO for exit:");
                String result = scan.next();
                if (result.equals("NO")) {
                    break;
                }
            }
        }
    }
}
