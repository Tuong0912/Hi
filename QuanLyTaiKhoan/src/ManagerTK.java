import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagerTK {
    Map<String, String> quanLyTK = new HashMap<String, String>();
    Scanner scanner = new Scanner(System.in);



    public String login() {
        System.out.println("Nhap tai khoan");
        String name = scanner.nextLine();
        System.out.println("Nhap mat khau");
        String pass = scanner.nextLine();
        if (quanLyTK.containsKey(name)) {
            if (quanLyTK.get(name).contains(pass)) {
                System.out.println("Dang nhap thanh cong");
            }else {
                System.out.println("Sai mat khau");
            }
        } else
            System.out.println("sai mat khau hoac tai khoan");

        return quanLyTK.put(name, pass);
    }

    public void dangKy() {
        System.out.println("Nhap tai khoan");
        String name = scanner.nextLine();
        System.out.println("Nhap mat khau");
        String pass = scanner.nextLine();
        if (quanLyTK.containsKey(name)) {
            System.out.println("Tai khoan da ton tai ");
        } else {
            TaiKhoan taiKhoan = new TaiKhoan(name , pass);
            quanLyTK.put(taiKhoan.getName(), taiKhoan.getPasspass());
        }
    }

    public void doiMatKhau(){
        System.out.println("Nhap tai Khoan");
        String name = scanner.nextLine();
        System.out.println("Nhap mat khau");
        String pass = scanner.nextLine();
        if(quanLyTK.containsKey(name)){
            if(quanLyTK.get(name).equals(pass)){
                System.out.println("Nhập mật khẩu mới");
                String pass1 = scanner.nextLine();
                TaiKhoan taiKhoan = new TaiKhoan(name , pass1);
                quanLyTK.put(name , pass1);
                System.out.println("Đổi mật khẩu thành công");
            }else {
                System.out.println("Sai mat khau");
            }
        }else {
            System.out.println("Sai tai khoan");
        }
    }

}
