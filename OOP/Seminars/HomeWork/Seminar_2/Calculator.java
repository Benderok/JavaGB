package OOP.Seminars.HomeWork.Seminar_2;

public class Calculator implements Operations {
    private double firstNumber;
    private double secondNumber;
    private String symbol;

    public Calculator(double firstNumber, double secondNumber, String symbol) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.symbol = symbol;
    }

    public double getFirstNum() {
        return firstNumber;
    }
    public double getSecNum() {
        return secondNumber;
    }
    public String getSymbol() {
        return symbol;
    }
    @Override
    public double summ() {
        return firstNumber + secondNumber;
    }
    @Override
    public double difference() {
        return firstNumber - secondNumber;
    }
    @Override
    public double multipication() {
        return firstNumber * secondNumber;
    }
    @Override
    public double division() {
        return firstNumber / secondNumber;
    }
}
