# Hi
import java.util.Scanner;

public class Ungdungtinhlai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double a = scanner.nextDouble();
        System.out.println("Nhập tỉ lệ lãi suất");
        double b = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi");
        double c = scanner.nextDouble();
        double Lai = (a * ( c / 100 ) / 12 )*c ;
        System.out.println(Lai);
    }
}
