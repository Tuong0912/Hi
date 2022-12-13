import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ManagerTK managerTK = new ManagerTK();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Đăng nhập");
            System.out.println("3. Đăng ký");
            System.out.println("4. Đổi mật khẩu");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    managerTK.login();
                    break;
                case 2:
                case 3:
                    managerTK.dangKy();
                    break;
                case 4:
                    managerTK.doiMatKhau();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}