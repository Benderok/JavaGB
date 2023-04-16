package OOP.Seminars.HomeWork.Seminar_2;

public class OpsSelect extends Calculator{
    public OpsSelect(double num1, double num2, String sym) {
        super(num1, num2, sym);
    }

    public String operation(String sym) {
        switch (sym) {
            case "+":
                return (String.format("%.2f + %.2f = %.2f", getFirstNum(), getSecNum(), summ()));
            case "-":
                return String.format("%.2f - %.2f = %.2f", getFirstNum(), getSecNum(), difference());
            case "*":
                return String.format("%.2f * %.2f = %.2f", getFirstNum(), getSecNum(), multipication());
            case "/":
                return String.format("%.2f / %.2f = %.2f", getFirstNum(), getSecNum(), division());
            default:
                return null;
        }
    }
}
