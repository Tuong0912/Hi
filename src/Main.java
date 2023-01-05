import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        login();
    }


    public static void login() {
        Scanner sc = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();
        while (true) {
            try {
                System.out.println();
                System.out.println("[1] Đăng nhập ADMIN");
                System.out.println("[2] Đăng Nhập sinh viên");
                System.out.println("[3] Đổi mật khẩu");
                System.out.println("[4] Lấy lại mật khẩu");
                System.out.println("Press any button to Exit ( Except [1] -> [4] )");
                System.out.print("Nhập lựa chọn : ");
                int choice = Integer.parseInt(sc.nextLine());
                System.out.println();
                switch (choice) {
                    case 1 -> managerAccount.loginAdmin();
                    case 2 -> managerAccount.loginUser();
                    case 3 -> managerAccount.changePassWord();
                    case 4 -> managerAccount.forGotPassWord();
                    default -> System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Mời nhập lại");
            }
        }
    }

    public void studentMenu() {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("[1] Đăng ký môn học");
                System.out.println("[2] Đăng ký bài kiểm tra");
                System.out.println("[3] Đăng xuất");
                System.out.print("Nhập lựa chọn : ");
                int a = Integer.parseInt(sc.nextLine());
                switch (a) {
                    case 1 -> managerStudent.registerTheCourse();
                    case 2 -> managerStudent.registerForTheTest();
                    case 3 -> {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập từ 1 đến 3");

            }
        }
    }

    public void adminMenu() {
        ManagerStudent managerStudent = new ManagerStudent();
        ManagerAccount managerAccount = new ManagerAccount();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("Menu");
                System.out.println("[1] Đăng ký tài khoản cho sinh viên");
                System.out.println("[2] Thêm sinh viên vào danh sách");
                System.out.println("[3] Hiển thị danh sách");
                System.out.println("[4] Sửa theo id");
                System.out.println("[5] Hiển thị sinh viên có điểm thấp nhất");
                System.out.println("[6] Hiển thị sinh viên có điểm cao nhất");
                System.out.println("[7] Xóa sinh viên theo ID");
                System.out.println("[8] Tìm sinh viên theo tên đã nhập");
                System.out.println("[9] Kiểm tra những sinh viên học chung lớp");
                System.out.println("[10] Sắp xếp sinh viên theo điểm");
                System.out.println("[11] Đăng xuất");
                System.out.print("Mời nhập lựa chọn : ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println();
                switch (a) {
                    case 1 -> managerAccount.registerAnAccount();
                    case 2 -> managerStudent.add();
                    case 3 -> managerStudent.show();
                    case 4 -> managerStudent.edit();
                    case 5 -> {
                        System.out.println("Sinh viên có điểm thấp nhất là");
                        managerStudent.showMinPoint();
                    }
                    case 6 -> {
                        System.out.println("Sinh viên có điểm thấp nhất là");
                        managerStudent.showMaxPoint();
                    }
                    case 7 -> {
                        System.out.println("Danh sách sau khi sắp xếp");
                        managerStudent.delete();
                    }
                    case 8 -> managerStudent.search();
                    case 9 -> managerStudent.checkClass();
                    case 10 -> {
                        managerStudent.sortUpByPoint();
                        System.out.println("Danh sách sau khi sắp xếp");
                        managerStudent.show();
                    }
                    case 11 -> {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại");
            }
        }
    }


}