import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    Scanner sc = new Scanner(System.in);
    ArrayList<Candy> candies = new ArrayList<>();

    public void showCandy() {
        for (int i = 0; i < candies.size(); i++) {
            System.out.println(candies.get(i).toString());
        }
    }

    public void addCandy() {
        System.out.println("Nhập cân nặng");
        double weight = Double.parseDouble(sc.nextLine());
        Candy candy = new Candy(weight);
        candies.add(candy);
    }
}
