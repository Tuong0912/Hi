# Hi
import java.util.Scanner;
public class Daoday {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = new int[size];

        //Hiện chỗ để nhập
        for( int i = 0 ; i < array.length ; i ++){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        //Hiện mảng đã nhập xong
        System.out.println("" +"Elements in array: "+ "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("");

        //Đảo ngược mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //Hiện mảng đã đảo ngược
        System.out.println("" +"Reverse array: "+ "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
