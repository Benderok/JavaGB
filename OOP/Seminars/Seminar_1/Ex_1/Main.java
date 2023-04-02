package OOP.Seminars.Seminar_1.Ex_1;

public class Main {
    public static void main(String[] args) throws Exception {
        VendingMachine machine = new VendingMachine();
        machine.addProduct("Coca-cola", 100);
        machine.addProduct("Snikers", 50);
        System.out.println(machine.getProductByPrice(50).toString());
        System.out.println(machine.getProductByname("Coca-cola").toString());
    }
}