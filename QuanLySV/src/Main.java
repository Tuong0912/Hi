import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void login() {
        Scanner sc = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();
        while (true) {
            try {
                System.out.println("[1] Đăng ký");
                System.out.println("[2] Đăng Nhập");
                System.out.println("[3] Đổi mật khẩu");
                System.out.println("Press any button to Exit ( Except [1] -> [3] )");
                System.out.println("Nhập lựa chọn ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> managerAccount.dangKyTaiKhoan();
                    case 2 -> managerAccount.dangNhap();
                    case 3 -> managerAccount.doiMatKhau();
                    default -> System.exit(0);
//                    default -> throw new IllegalStateException("Unexpected value: " + choice);
                }
            } catch (Exception e) {
                System.out.println("Mời nhập lại");
            }
        }
    }

    public static void menu() {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu");
                System.out.println("[1] Thêm sinh viên vào danh sách");
                System.out.println("[2] Hiển thị danh sách");
                System.out.println("[3] Sửa theo id");
                System.out.println("[4] Hiển thị sinh viên có điểm thấp nhất");
                System.out.println("[5] Hiển thị sinh viên có điểm cao nhất");

                System.out.println("[6] Xóa sinh viên theo ID");
                System.out.println("[7] Tìm sinh viên theo tên đã nhập");
                System.out.println("[8] Hiển thị theo giới tính");
                System.out.println("[9] Kiểm tra những học sinh học chung lớp");
                System.out.println("[10] Đăng ký môn học");
                System.out.println("[11] Đăng ký bài kiểm tra");
                System.out.println("[12] Sắp xếp sinh viên theo điểm");
                System.out.println("[13] Đăng xuất");
                System.out.println("Nhập lựa chọn");

                int a = Integer.parseInt(sc.nextLine());
                switch (a) {
                    case 1 -> managerStudent.add();
                    case 2 -> managerStudent.show();
                    case 3 -> managerStudent.edit();
                    case 4 -> managerStudent.minDiem();
                    case 5 -> managerStudent.maxDiem();

                    case 6 -> managerStudent.delete();
                    case 7 -> managerStudent.search();
                    case 8 -> managerStudent.hienThiTheoGioiTinh();
                    case 9 -> managerStudent.checkClass();
                    case 10 -> managerStudent.dangKyMonHoc();
                    case 11 -> managerStudent.dangKyBaiKiemTra();
                    case 12 -> {
                        managerStudent.sapXepSinhVienTheoDiem();
                        System.out.println("Danh sách sau khi sắp xếp");
                        managerStudent.show();
                    }
                    case 13 -> {
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Chỉ nhập từ 1 đến 12");

            }
        }
    }


}