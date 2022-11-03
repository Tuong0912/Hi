# Hi
import java.util.Scanner;

public class Chuyendoinhietdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        double celsius;
        double fahrenheit;
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Nhập fahrenheit");
                fahrenheit = scanner.nextDouble();
                celsius = ( 5.0 / 9 ) * ( fahrenheit - 32 );
                System.out.println( "celsius = " + celsius);
                break;
            case 2:
                System.out.println("Nhập celsius");
                celsius = scanner.nextDouble();
                fahrenheit = celsius * ( 9 / 5) + 32;
                System.out.println( "fahrenheit = " + fahrenheit);
                break;
            case 0:
                System.exit(0);
        }
    }
}
