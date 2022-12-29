import java.util.ArrayList;
import java.util.Scanner;

public class ProductManaget {
    CategoryManager categoryManager = new CategoryManager();

    Scanner sc = new Scanner(System.in);
    int id = 0;
    ArrayList<Product> products = new ArrayList<>();

    public void showProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void addProduct() {
        id++;
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng");
        int quantity = Integer.parseInt(sc.nextLine());
        Category category = categoryManager.add();
        Product product = new Product(id, name, price, quantity, category);
        System.out.println("Bạn muốn candy hay drinks");
        System.out.println("1. Nhập candy");
        System.out.println("2. Nhập drinks");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> addCandy();
            case 2 -> addDrink();
        }
        products.add(product);

    }

    public void addCandy() {
        System.out.println("Nhập cân nặng");
        double weight = Double.parseDouble(sc.nextLine());
        Candy candy = new Candy(weight);
        products.add(candy);
    }

    public void addDrink() {
        System.out.println("Nhập thể tích");
        double volume = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập loại chai");
        String bottleType = sc.nextLine();
        Drinks drinks = new Drinks(volume, bottleType);
        products.add(drinks);
    }

    public void showDrinks() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Drinks) {
                System.out.println(products.get(i));
            }
        }
    }

    public void showCandy() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Candy) {
                System.out.println(products.get(i));
            }
        }
    }
    //Hiểu thị danh sách sản phẩm là Drinks theo loại chai đựng

    public void showDrinkByBottleType() {
        System.out.println("Nhập loại chai cần tìm");
        String bottleType = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Drinks) {
                if (bottleType.equals(((Drinks) products.get(i)).bottleType())) {
                    System.out.println(products.get(i));
                }
            }
        }
    }

    public void showCandytByWeight() {
        double max = 0;
        Candy candy = new Candy();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Candy) {
                if (((Candy) products.get(i)).weight() > max) {
                    max = ((Candy) products.get(i)).weight();
                    candy = ((Candy) products.get(i));
                }
            }
        }
        System.out.println(candy);
    }


    public void hienThiSanPhamDatTienNhat() {
        int max = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).price() > max) {
                max = (int) products.get(i).price();
            }
        }
        System.out.println(max);
    }

    public void hienThiSanPhamReTienNhat() {
        int min = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).price() < min) {
                min = (int) products.get(i).price();
            }
        }
        System.out.println(min);
    }

    public void hienThiSanPhamNhieuSoLuongNhat() {
        int max = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).quantity() > max) {
                max = (int) products.get(i).quantity();
            }
        }
        System.out.println(max);

    }

    public void hienThiSanPhamItSoLuongNhat() {
        int min = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).quantity() < min) {
                min = (int) products.get(i).quantity();
            }
        }
        System.out.println(min);
    }


    public void showLoaiChaiThuyTinh() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Drinks) {
                if (((Drinks) products.get(i)).bottleType().equalsIgnoreCase("ThuyTinh")) {
                    System.out.println(products.get(i));
                }
            }
        }
    }

    public void showSanPhamDrinkCoGiaCaoNhat() {
        double max = 0;
        Product product = new Product();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).price() > max) {
                max = products.get(i).price();
                product = products.get(i);
            }
        }
        System.out.println(product);
    }

    public void kiemTraTrungNameCategory() {
        System.out.println("Nhập name Category");
        String nameCategory = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (nameCategory.equals( products.get(i).category())) {
                System.out.println(products.get(i));
            }else
                System.out.println("Hehe");
        }
    }


}
