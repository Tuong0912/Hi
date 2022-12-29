import java.util.Scanner;

public class BaiKiemTra{
    Scanner sc = new Scanner(System.in);
    public double baiKiemTraJava() {
        int countHint = 3;
        int countcode = 0;
        System.out.println("                            ------ BÀI KIỂM TRA JAVA ------");
        System.out.println("                                   Bạn có 45' làm bài");
        System.out.println();

        System.out.println("                            ------ Bạn có 3 lần gợi ý ------");
        System.out.println("                                  Nhấn Y để dùng gợi ý");


        System.out.println();
        System.out.println("                            Câu 1 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Có mấy loại Access modifier : ");
        System.out.print("Mời nhập đáp án : ");
        String a = sc.nextLine();

        if (a.equalsIgnoreCase("Y")) {
            System.out.println("Đáp án là : 4");
            countHint--;                      //Gợi ý -1
            System.out.print("Mời nhập đáp án : ");
            String b = sc.nextLine();
            if (b.equals("4")) {
                System.out.println("Đúng");
                countcode++;                //1
            } else System.err.println("Đã gợi ý còn sai , gà vl");
        } else if (a.equals("4")) {
            System.out.println("Đúng");
            countcode++;                    //1
        } else System.err.println("Sai     Đáp án : 4");


        System.out.println();


        System.out.println("                            Câu 2 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Có mấy dạng kế thừa trong Java");
        System.out.print("Mời nhập đáp án : ");
        a = sc.nextLine();
        if (a.equalsIgnoreCase("Y")) {
            System.out.println("Đáp án là : 3");
            countHint--;                    //gợi ý -2
            System.out.print("Mời nhập đáp án : ");
            String b = sc.nextLine();
            if (b.equals("3")) {
                System.out.println("Đúng");
                countcode++;                //2
            } else System.err.println("Đã gợi ý còn sai , gà vl");
        } else if (a.equals("3")) {
            System.out.println("Đúng");
            countcode++;                    //2
        } else {
            System.err.println("Sai");
            System.out.println("Có 3 dạng kế thừa chính trong Java");
            System.out.print(" Kế thừa từ Class - ");
            System.out.print(" Kế thừa từ lớp trừu tượng (Abstract class) - ");
            System.out.print(" Kế thừa từ Interface");
        }

        System.out.println();


        System.out.println("                            Câu 3 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Phương thức sau đúng hay sai");
        System.out.println("                            Kiểm tra số nguyên tố ");
        System.out.println(
                """
                        1                                    Scanner scanner = new Scanner(System.in);
                        2                                    while (true) {
                        3                                        System.out.print("Enter a number:");
                        4                                        int number = scanner.nextInt();
                        5                                        if (number < 2) {
                        6                                            System.out.println(number + " is not a prime");
                        7                                        } else {
                        8                                            int i = 2;
                        9                                            boolean check = true;
                        10                                            while (i <= Math.sqrt(number)) {
                        11                                               if (number % i != 0) {
                        12                                                  check = false;
                        13                                                 break;
                        14                                            }
                        15                                           i++;
                        16                                      }
                        17                                            if (check)
                        18                                                System.out.println(number + " is a prime");
                        19                                            else
                        20                                                System.out.println(number + " is not a prime");
                        21                                        }
                        22                                    }
                        """);
        System.out.println("                            Nhập vị trí sai trong đoạn code trên");
        System.out.print("Mời nhập đáp án : ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("Đáp án là : 11");
            countHint--;                    //gợi ý -3
            System.out.print("Mời nhập đáp án : ");
            String b = sc.nextLine();
            if (b.equals("11")) {
                System.out.println("Đúng");
                countcode++;                    //3
            } else System.err.println("Đã gợi ý còn sai , gà vl");
        } else if (input.equalsIgnoreCase("11")) {
            System.out.println("Đúng");
            countcode++;                        //3
        } else {
            System.err.println("Sai     Đáp án : Vị trí 11");
        }


        System.out.println();


        System.out.println("                            Câu 4 ( Bạn có " + countHint + " lần gợi ý ) ");
        System.out.println("                                        Map         ");
        System.out.println("                                ↗              ↖     ");
        System.out.println("                             AbstractMap     SortedMap");
        System.out.println("                                 ∆    ↖          ⇡ ");
        System.out.println("                                 |      ↖     NavigableMap");
        System.out.println("                                 |        ↖      ↗    ");
        System.out.println("                               ???        TreeMap");
        System.out.print("Nhập đáp án : ");
        String hashMap = sc.nextLine();

        if (hashMap.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("HashMap")) {
                    System.out.println("Đúng");
                    countcode++;                    //4
                } else System.err.println("Sai     Đáp án : HashMap");
            } else {            //Khi countHint != 0
                countHint--;
                System.out.println("Gợi ý : Has...");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("HashMap")) {
                    System.out.println("Đúng");
                    countcode++;                    //4
                } else System.err.println("Sai     Đáp án : HashMap");
            }

        } else if (hashMap.equalsIgnoreCase("HashMap")) {
            System.out.println("Đúng");
            countcode++;                                        //4
        } else {
            System.err.println("Sai     Đáp án : HashMap");
        }


        System.out.println();


        System.out.println("                            Câu 5 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Một cặp Key - Value được gọi là gì ?");
        System.out.print("Nhập đáp án : ");
        String entry = sc.nextLine();
        if (entry.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("Entry")) {
                    System.out.println("Đúng");
                    countcode++;                    //3
                } else System.err.println("Sai     Đáp án : Entry");
            } else {            //Khi countHint != 0
                System.out.println("Gợi ý : En...");
                countHint--;                    //gợi ý -5
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("Entry")) {
                    System.out.println("Đúng");
                    countcode++;                    //5
                } else System.err.println("Đã gợi ý còn sai , gà vl");
            }
        } else if (entry.equalsIgnoreCase("Entry")) {
            System.out.println("Đúng");
            countcode++;                                    //5
        } else {
            System.out.println("Sai       Đáp án : Entry");
        }

        System.out.println();


        System.out.println("                            Câu 6 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("""
                                            Giả sử có 2 lớp NhanVien và TruongPhong được khai báo như sau?\s

                                            public class NhanVien {
                                                public String hoTen;
                                                protected double luong;

                                                public NhanVien(String hoTen, double luong) {
                                                }

                                                void xuat() {
                                                }

                                                private double getThuNhap() {
                                                    return 0;
                                                }
                                            }


                                    package codegym.dn

                                            public class TruongPhong extends NhanVien {
                                                public double trachNhiem;

                                                public TruongPhong(String hoTen, double luong, double trachNhiem) {
                                                }

                                                public void xuat() {
                                                    super.hoTen = "Tuấn";
                                                    super.luong = 500;
                                                    super.xuat();
                                                    double thuNhap = super.getThuNhap();
                                                }
                                            }
                """);
        System.out.println("                            Hãy chọn dòng mã lệnh phát sinh lỗi lúc dịch");
        System.out.print(" ");
        System.out.println("""

                                                  a. super.hoTen = "Tuấn"

                                                  b. double thuNhap = super.getThuNhap()

                                                  c. super.luong = 500

                                                  d. super.xuat()\
                                                  
                """);
        System.out.print("Mời nhập đáp án : ");
        String bb = sc.nextLine();
        if (bb.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("b")) {
                    System.out.println("Đúng");
                    countcode++;                    //6
                } else System.out.println("Sai     Đáp án : b. double thuNhap = super.getThuNhap()");
            } else {            //Khi countHint != 0
                System.out.println("Gợi ý : b. double thuNhap = super.getThuNhap()");
                countHint--;
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("b")) {
                    System.out.println("Đúng");
                    countcode++;                    //6
                } else System.err.println("Sai     Đáp án : b. double thuNhap = super.getThuNhap() ");
            }
        } else if (bb.equalsIgnoreCase("B")) {
            System.out.println("Đúng");
            countcode++;                        //6
        } else {
            System.err.println("Sai     Đáp án : b. double thuNhap = super.getThuNhap()");
        }


        System.out.println();


        System.out.println("                            Câu 7 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Từ khoá gì được sử dụng để kế thừa Interface ?");
        System.out.print("Nhập đáp án : ");
        String extend = sc.nextLine();
        if (extend.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("extends")) {
                    System.out.println("Đúng");
                    countcode++;                    //7
                } else System.err.println("Sai     Đáp án : extends");
            } else {            //Khi countHint != 0
                countHint--;
                System.out.println("Gợi ý : ex...");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("extends")) {
                    System.out.println("Đúng");
                    countcode++;                    //3
                } else {
                    System.err.println("Sai       Đáp án : extends");
                }
            }


        } else if (extend.equalsIgnoreCase("Extends")) {
            System.out.println("Đúng");
            countcode++;                        //7
        } else {
            System.err.println("Sai       Đáp án : extends");
        }

        System.out.println();


        System.out.println("                            Câu 8 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                                     Collection  ");
        System.out.println("                                   ↗            ↖ ");
        System.out.println("                                list      AbstractCollection");
        System.out.println("                                   ↖            ↗   ");
        System.out.println("                                        ?????        ");
        System.out.print("Mời nhập đáp án : ");
        String abstractList = sc.nextLine();
        if (abstractList.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("AbstractList")) {
                    System.out.println("Đúng");
                    countcode++;
                } else System.err.println("Sai     Đáp án : AbstractList");
            } else {            //Khi countHint != 0
                countHint--;                    // - 8
                System.out.println("Gợi ý : Abs...");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("AbstractList")) {
                    System.out.println("Đúng");
                    countcode++;                    //8
                } else System.err.println("Sai       Đáp án : AbstractList");
            }


        } else if (abstractList.equalsIgnoreCase("AbstractList")) {
            System.out.println("Đúng");
            countcode++;                            //8
        } else {
            System.err.println("Sai     Đáp án : AbstractList");
        }


        System.out.println();


        System.out.println("                            Câu 9 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Phương thức nào kiểm tra xem một phần tử có nằm trong danh sách không?");
        System.out.println("""
                Select one:

                A. contains()

                B. get()

                C. clear()

                D. indexOf()""");
        System.out.print("Mời nhập đáp án : ");
        String conTains = sc.nextLine();
        if (conTains.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("A")) {
                    System.out.println("Đúng");
                    countcode++;                    //9
                } else System.err.println("Sai     Đáp án : A. contains()");
            } else {            //Khi countHint != 0
                countHint--;
                System.out.println("Gợi ý : c");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("A")) {
                    System.out.println("Đúng");
                    countcode++;                    //9
                } else System.err.println("Sai       Đáp án : A. contains()");
            }


        } else if (conTains.equalsIgnoreCase("A")) {
            System.out.println("Đúng");
            countcode++;                        //9
        } else System.err.println("Sai    Đáp án : A. contains  ");

        System.out.println();
        System.out.println("                            Câu 10 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("""
                                           Phương thức nào không sử dụng để duyệt cây ?

                                           Select one:

                                           a. Duyệt hậu thứ tự (Post-order Traversal)

                                           b. Duyệt trung thứ tự (In-order Traversal)
                                           \s

                                           c. Duyệt tiền thứ tự (Pre-order Traversal)
                                           \s

                                           d. Duyệt tuyến tính (Linear Traversal)
                                           Feedback
                """);
        System.out.println("                    Bạn có " + countHint + " lần gợi ý");
        System.out.print("Nhập đáp án : ");
        String linearTraversal = sc.nextLine();
        if (linearTraversal.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("D")) {
                    System.out.println("Đúng");
                    countcode++;                    //10
                } else System.err.println("Sai     Đáp án : d. Duyệt tuyến tính (Linear Traversal)\n" +
                        "                Feedback");
            } else {            //Khi countHint != 0
                countHint--;
                System.out.println("Gợi ý : Duyệt t....");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("D")) {
                    System.out.println("Đúng");
                    countcode++;                    //10
                } else System.err.println("Sai       Đáp án : d. Duyệt tuyến tính (Linear Traversal)\n" +
                        "                Feedback");
            }


        } else if (linearTraversal.equalsIgnoreCase("D")) {
            System.out.println("Đúng");
            countcode++;                    //10
        } else System.err.println("Sai     Đáp án : d. Duyệt tuyến tính (Linear Traversal) Feedback");

        System.out.println();

        System.out.println("                                   Điểm kiểm tra " + countcode + "đ");
        return countcode;

    }

}
