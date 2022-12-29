import java.util.ArrayList;
import java.util.Scanner;

public class CategoryManager {
    int id = 0;
    Scanner sc = new Scanner(System.in);
    ArrayList<Category> categories = new ArrayList<>();

    public Category add() {
        id++;
        System.out.println("Nhập Tên Sản Phẩm Của Category");
        String name = sc.nextLine();
        Category category = new Category(id, name);

        return category;
    }

    public void deleteById(int id) {
        System.out.println("Nhập id cần xóa");
        id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < categories.size(); i++) {
            if (id == categories.get(i).id()) {
                categories.remove(i);
            } else {
                System.out.println("Không tồn tại sản phẩm");
            }
        }
    }

    public void show() {
        for (int i = 0; i < categories.size(); i++) {
            System.out.println(categories.get(i).toString());
        }
    }
    public void edit(int id){
        id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < categories.size(); i++) {
            if(id == categories.get(i).id()){
                System.out.println("Nhập tên mới");
                String name1 = sc.nextLine();
                categories.get(i).setName(name1);
            }
        }
    }

}
