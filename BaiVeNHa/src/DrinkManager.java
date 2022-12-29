import java.util.ArrayList;
import java.util.Scanner;

public class DrinkManager extends  Product {
    ArrayList<Drinks> drinks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void showDrink() {
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i).toString());
        }
    }

    public void addDrink() {
        System.out.println("Nhập volume");
        double volume = sc.nextDouble();
        System.out.println("Nhập bottleType");
        String bottleType = sc.nextLine();
        Drinks drinks1 = new Drinks(volume , bottleType);
        drinks.add(drinks1);
    }
}
