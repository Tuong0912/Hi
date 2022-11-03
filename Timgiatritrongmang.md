# Hi
import java.util.Scanner;

public class Timgiatritrongmang {
    public static void main(String[] args) {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Tuong" , "Toan" , "Bach" , "Cuong"};

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        for( int i = 0 ; i < students.length ; i ++){
            if(students[i].equals(name)){
                System.out.println("Vị trí tên " + name + " là " + (i+1));
                break;
            } else  if( i >= students.length - 1 ){
                System.out.print("Tên bạn nhập " + name + " không có trong mảng");
            }
        }

    }
}
