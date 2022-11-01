# Hi
import java.util.Scanner;

public class Tinhnamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần check");
        int year = scanner.nextInt();
        if( year % 4 == 0){
            if( year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Là năm nhuận");
                }else{
                    System.out.println("không là năm nhuận");
                }
            }else {
                System.out.println("Là năm nhuận");
            }
        }else {
            System.out.println("Không là năm nhuận");
        }
    }
}
