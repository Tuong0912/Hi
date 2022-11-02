# Hi
import java.util.Scanner;

public class Timuoclonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ;
        int b;
        System.out.println("Nhập a");
        a = scanner.nextInt();
        System.out.println("Nhập b");
        b = scanner.nextInt();
        if(a == 0 || b == 0){
            System.out.println("Nhập lại");
        }
        while (a != b){
            if(a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất của a và b là " + a);
    }
}
