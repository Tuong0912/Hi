# Hi
import java.util.Scanner;

public class Chuyendoitien {
    public static void main(String[] args) {
        System.out.println("Chuyển tiền từ VNĐ sang USD");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số tiền VNĐ");
        float vnđ = scanner.nextFloat();
        float usd = vnđ / 23000;
        System.out.println(usd + " USD");
    }
}
