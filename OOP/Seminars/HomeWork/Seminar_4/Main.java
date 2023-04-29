package OOP.Seminars.HomeWork.Seminar_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        VendingMachine wm1 = new VendingMachine<>();
          Coffee co1 = new Coffee("Nestle",3);
          Chips ch1 = new Chips(1, "Cheese");
          BottleOfWater bw1 = new BottleOfWater("Spring", 2);
          wm1.addProducts(co1);
          wm1.addProducts(ch1);
          wm1.addProducts(bw1);
        System.out.println();
          wm1.getInfo();
          wm1.removeProduct(ch1);
          wm1.getInfo();
}
}
