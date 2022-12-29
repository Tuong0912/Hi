import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerStudent {
    BaiKiemTra baiKiemTra = new BaiKiemTra();
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();
    int id = 0;


    public void show() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void add() {
        System.out.println("nhập tên ");
        String name = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z]{1,7}");
        do {
            if (p.matcher(name).matches()) {
                {
                    for (int i = 0; i < students.size(); i++) {
                        if (name.equals(students.get(i).ten())) {
                            System.out.println("Tên đã tồn tại , mời nhập lại");
                            name = sc.nextLine();
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Chỉ nhập chữ   -   Mời nhập lại");
                name = sc.nextLine();
            }
        } while (!p.matcher(name).matches());


        System.out.println("Nhập age");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập giới tính");
        String gender;
        System.out.println("1. Chọn nam");
        System.out.println("2. Chọn nữ");
        System.out.println("3. Khác");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1 -> gender = "Nam";
            case 2 -> gender = "Nữ";
            default -> gender = "Khác";
        }


        System.out.println("Nhập địa chỉ ");
        String diaChi = sc.nextLine();

        id++;

        String className;
        System.out.println("Chọn lớp để học");
        System.out.println("1. Lớp C10");
        System.out.println("2. Lớp C09");
        System.out.println("3. Lớp C08");
        System.out.println("4. Nhập để đăng ký lớp học");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1 -> className = "C10";
            case 2 -> className = "C09";
            case 3 -> className = "C08";
            case 4 -> className = sc.nextLine();
            default -> className = "Chọn linh tinh , đánh bome -.-";
        }
        Lop tenLop = new Lop(className);
        double dtb = 0;
        String monhoc = "";
        String hanhKiem = "";
        Student student1 = new Student(id, name, age, gender, diaChi, dtb, tenLop, monhoc, hanhKiem);
        students.add(student1);

    }


    public void maxDiem() {
        double max = students.get(0).dtb();
        Student student = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() > max) {
                max = students.get(i).dtb();
                student = students.get(i);
            }

        }
        System.out.println(student);
    }

    public void minDiem() {
        double min = students.get(0).dtb();
        Student student1 = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() < min) {
                student1 = students.get(i);
            }
        }
        System.out.println(student1);
    }

    public void delete() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                index = i;

            }
        }
        students.remove(index);
    }

    public void search() {

        System.out.println("Nhập tên cần tìm");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).ten().toLowerCase().contains(name.toLowerCase())) {
                check = true;
                System.out.println(students.get(i));
            }
        }
        if (!check) {
            System.out.println("Không có tên tương ứng trong danh sách sinh viên");
        }
    }


    public void hienThiTheoGioiTinh() {
        System.out.println("Chọn giới tính ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).gender().equals("Nam")) {
                        System.out.println(students.get(i));
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).gender().equals("Nữ")) {
                        System.out.println(students.get(i));
                    }
                }
            }
        }
    }

    public void edit() {
        System.out.println("Nhập id cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                System.out.println("Nhập tên muốn sửa");
                String name = sc.nextLine();
                if (name.equals("")) {
                    System.out.println("không sửa");
                } else {
                    students.get(i).setTen(name);
                }

                System.out.println("Nhập tuổi muốn sửa");
                String age = sc.nextLine();
                if (age.equals("")) {
                    System.out.println("không sửa");
                } else {
                    students.get(i).setTuoi(Integer.parseInt(age));
                }

                System.out.println("Nhập giới tính muốn sửa");
                String gender = sc.nextLine();
                if (gender.equals("")) {
                    System.out.println("Không sửa");
                } else {
                    students.get(i).setGender(gender);
                }

                System.out.println("Nhập địa chỉ muốn sửa");
                String diaChi = sc.nextLine();
                if (diaChi.equals("")) {
                    System.out.println("Không sửa");
                } else {
                    students.get(i).setDiaChi(diaChi);
                }

                System.out.println("Nhập điểm trung bình muốn sửa");
                String dtb = sc.nextLine();
                if (dtb.equals("")) {
                    System.out.println("Không sửa");
                } else {
                    students.get(i).setDtb(Double.parseDouble(dtb));
                }


            }
        }
    }

    public void checkClass() {
        System.out.println("[1] C10");
        System.out.println("[2] C09");
        System.out.println("[3] C08");
        System.out.println("[4] Khác");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase("C10")) {
                        System.out.println(students.get(i).toString());
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase("C09")) {
                        System.out.println(students.get(i).toString());
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase("C08")) {
                        System.out.println(students.get(i).toString());
                    }
                }
            }
            case 4 -> {
                String className = sc.nextLine();
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase(className)) {
                        System.out.println(students.get(i).toString());
                    }

                }
            }
        }
    }

    public void dangKyMonHoc() {
        System.out.println("Nhập tên sinh viên muốn đăng ký ");
        String nameHocSinh = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (nameHocSinh.equalsIgnoreCase(students.get(i).ten())) {
                students.get(i).setMonHoc(chonMonHoc());
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Sinh viên không tồn tại");
        }
    }

    public String chonMonHoc() {
        String nameOject = null;
        System.out.println("Chọn môn học");
        System.out.println("1. Toán");
        System.out.println("2. Java");
        System.out.println("3. Anh");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> nameOject = "Toán";
            case 2 -> nameOject = "Java";
            case 3 -> nameOject = "Anh";
        }
        return nameOject;
    }


//    private void demo(String nameSinhVien) {
//        for (int i = 0; i < students.size(); i++) {
//            if (nameSinhVien.equalsIgnoreCase(students.get(i).ten())) {
//                if (students.get(i).getMonHoc().equalsIgnoreCase("Java")) {
//                    if (students.get(i).dtb() == 10) {
//                        students.get(i).setHanhKiem("Giỏi");
//                    } else if (students.get(i).dtb() > 8.5) {
//                        students.get(i).setHanhKiem("Giỏi");
//                    } else if (students.get(i).dtb() > 6.5) {
//                        students.get(i).setHanhKiem("Khá");
//                    } else {
//                        students.get(i).setHanhKiem("Trung Bình");
//                    }
//                    break;
//                }
//            }
//        }
//    }

    public String checkHanhKiemCuaSinhVien(double dtb) {
        if (dtb == 10) {
            return "Xuất sắc";
        } else if (dtb > 8.5) {
            return "Giỏi";
        } else if (dtb > 6.5) {
            return "Khá";
        } else {
            return "Trung Bình";
        }
    }

    public void dangKyBaiKiemTra() {
        System.out.print("Nhập tên sinh viên để kiểm tra : ");
        boolean check = false;
        String nameSinhVien = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (nameSinhVien.equalsIgnoreCase(students.get(i).ten())) {
                check = true;
                if (students.get(i).getMonHoc().equalsIgnoreCase("Java")) {
                    students.get(i).setDtb(this.baiKiemTraCode());
                    students.get(i).setHanhKiem(this.checkHanhKiemCuaSinhVien(students.get(i).dtb()));
                    break;
                }
                if (students.get(i).getMonHoc().equalsIgnoreCase("Toán")) {
                    check = true;
                    students.get(i).setDtb(this.baiKiemTraToan());
                    students.get(i).setHanhKiem(this.checkHanhKiemCuaSinhVien(students.get(i).dtb()));
                    break;
                }
            }
        }
        if (check == false) System.err.println("Sai tên , mời nhập lại");


    }


    public double baiKiemTraToan() {
        int count = 0;
        System.out.println("------ BÀI KIỂM TRA TOÁN ------");
        System.out.println("       Bạn có 45' làm bài");
        System.out.println();
        System.out.println("1 + 1 = ?");
        int a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;
        } else System.out.println("Sai");

        System.out.println("2 + 1 = ?");
        int b = Integer.parseInt(sc.nextLine());
        if (b == 3) {
            System.out.println("Đúng");
            count++;
        } else System.out.println("Sai");

        System.out.println("100 + 1 = ?");
        int c = Integer.parseInt(sc.nextLine());
        if (c == 101) {
            System.out.println("Đúng");
            count++;
        } else System.out.println("Sai");

        System.out.println("1+11");
        a = Integer.parseInt(sc.nextLine());
        if (a == 12) {
            System.out.println("Đúng");
            count++;
        } else System.out.println("Sai");

        System.out.println("123*321");
        a = Integer.parseInt(sc.nextLine());
        if (a == 343) {
            System.out.println("Đúng");
            count++;
        } else System.out.println("Sai");

        System.out.println("Pi = ?");
        System.out.println("Làm tròn đến 4 số ");
        double d = Double.parseDouble(sc.nextLine());
        if (d == 3.1415) {
            System.out.println("Đúng");
            count++;                            //6
        } else System.out.println("Sai");

        System.out.println(" 123+321 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 444) {
            System.out.println("Đúng");
            count++;                            //7
        } else System.out.println("Sai");

        System.out.println("1 + 1 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;                            //8
        } else System.out.println("Sai");


        System.out.println("1 + 1 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;                            //9
        } else System.out.println("Sai");


        System.out.println("1 + 1 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;                            //10
        } else System.out.println("Sai");

        int z = count;
        System.out.println(z);
        return z;
    }

    //Thêm phương thức check xem học sinh có đỗ hay không ( dựa vào điểm )

    public double baiKiemTraCode() {
        return baiKiemTra.baiKiemTraJava();
    }

    public void sapXepSinhVienTheoDiem() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.dtb() < o2.dtb()) {
                    return -1;
                } else if (o1.dtb() > o2.dtb()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}
