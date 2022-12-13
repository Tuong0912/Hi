import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
    Scanner sc = new Scanner(System.in);

    ArrayList<Student> students = new ArrayList<>();
    int id = 0;


    public void show() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void Add() {
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập địa chỉ ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm trung bình");
        double dtb = Double.parseDouble(sc.nextLine());
        id++;
        ArrayList<MonHoc> monhoc = new ArrayList<>();
        Student student1 = new Student(id, name, age, gender, diaChi, dtb, monhoc);
        students.add(student1);

    }

    public void maxDiem() {
        double a = 0;
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() > a) {
                a = students.get(i).dtb();
                student = students.get(i);
            }

        }
        System.out.println(student);
    }

    public void minDiem() {
        double a = students.get(0).dtb();
        Student student1 = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() < a) {
                student1 = students.get(i);
            }
        }
        System.out.println(student1);
    }

    public void delete() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                students.remove(i);
            }
        }
    }

    public void search() {
        System.out.println("Nhập tên cần tìm");
        String name = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (name.equals(students.get(i).ten())) {
                System.out.println(students.get(i));
            }
        }
    }

    public void hienThiTheoGioiTinh() {
        System.out.println("Nhập giới tính ");
        String gender = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (gender.equals(students.get(i).gender())) {
                System.out.println(students.get(i));
            }
        }
    }

    public void edit() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                this.Add();
            }
        }
    }

    public void DangKyBaiKiemTra() {
        System.out.println("Nhập tên muốn đăng ký");
        String input = sc.nextLine();

    }

    public void themMonHoc() {
        System.out.println("Nhập id sinh viên cần đăng ký:");
        int  idSV = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập id môn học cần đăng ký:");
//        int  idMonHoc = Integer.parseInt(sc.nextLine());
        MonHoc tmp = new MonHoc();

        for (int i=0; i<students.size(); i++) {
            if (students.get(i).id() == idSV) {
                students.get(i).getDsMonHoc().add(tmp);
            }
        }
    }


    public void KiemTraToan() {
//        int count = 0;
//        System.out.println("");
//        int a = Integer.parseInt(sc.nextLine());
//        if(a == 7){
//            count += 2;
//        }
        System.out.println();
        System.out.println();
        System.out.println();
    }


}
//nhập môn từ bàn phím rồi lưu môn học vào thuộc tính của đối tượng
// lưu sẵn cụm từ để so sánh với cái nhập vào , chia thành các trường hợp nhập vào để từ đó 
// suy ra môn sẽ làm bài kiểm tra 
