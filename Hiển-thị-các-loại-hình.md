# Hi
import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In tam giác vuông");
        System.out.println("3. In tam giác vuông");
        System.out.println("4. Lối ra");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                break;
            case 2:
                System.out.println("Nhạp chiều rộng");
                int w = scanner.nextInt();
                for (int i = 1 ; i <= w ; i++){
                    for (int j =1 ; j <= i ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3:
                System.out.println("Nhập");
                int a = scanner.nextInt();
                for (int i = a ; i >= 1 ; i --){
                    for(int j = 1 ; j <= i ; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 4:
                System.exit(0);
        }
    }
}
