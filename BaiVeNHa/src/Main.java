import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManaget productManaget = new ProductManaget();
        CandyManager candyManager = new CandyManager();
        DrinkManager drinkManager = new DrinkManager();
        try {
            while (true) {
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiển thị sản phẩm");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> productManaget.addProduct();
                    case 2 -> {
                        System.out.println("1. Hiển thị Product");
                        System.out.println("2. Hiển thị Drinks");
                        System.out.println("3. Hiển thị Candy");
                        System.out.println("4. Hiển thị danh sách sản phẩm có giá cao nhất");
                        System.out.println("5. Hiển thị danh sách sản phẩm có giá thấp nhất");
                        System.out.println("6. Hiển thị danh sách sản phẩm có số lượng nhiều nhất");
                        System.out.println("7. Hiển thị danh sách sản phẩm có số lượng ít nhất");
                        System.out.println("8. Hiển thị theo loại chai đựng");
                        System.out.println("9. Hiển thị Candy có câng nặng cao nhất");
                        System.out.println("11 .Hiển thị sản phẩm Drinks có loại chai là thủy tinh và có giá lớn nhất");
                        System.out.print("Nhập lựa chọn : ");
                        int choose = Integer.parseInt(sc.nextLine());
                        switch (choose) {
                            case 1 -> productManaget.showProduct();
                            case 2 -> productManaget.showDrinks();
                            case 3 -> productManaget.showCandy();
                            case 4 -> productManaget.hienThiSanPhamDatTienNhat();
                            case 5 -> productManaget.hienThiSanPhamReTienNhat();
                            case 6 -> productManaget.hienThiSanPhamNhieuSoLuongNhat();
                            case 7 -> productManaget.hienThiSanPhamItSoLuongNhat();
                            case 8 -> productManaget.showDrinkByBottleType();
                            case 9 -> productManaget.showCandytByWeight();
                            case 10 -> productManaget.kiemTraTrungNameCategory();
                            case 11 -> {
                                productManaget.showLoaiChaiThuyTinh();
                                productManaget.showSanPhamDrinkCoGiaCaoNhat();
                            }
                        }
                    }
                }

            }
        } catch (Exception E) {
            System.out.println("Nhập lại");
        }


    }
}