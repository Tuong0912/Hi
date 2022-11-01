# Hi
import java.util.Scanner;

public class checkweight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cân nặng");
        double weight=scanner.nextDouble();

        System.out.println("Nhập chiều cao");
        double height=scanner.nextDouble();

        double bmi = weight/(height*height);

        if(bmi < 18.5){
            System.out.println (bmi + " Underweight");
        } else if(bmi < 25.0) {
            System.out.println( bmi + " Normal");
        } else if(bmi < 30.0)  {
            System.out.println(bmi + " Overweight");
        } else {
            System.out.println(bmi + " Obese");
        }
    }
}
