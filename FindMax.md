# Hi
import java.util.Scanner;

public class Timmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for( int i = 0 ; i < array.length ; i ++){
            System.out.println("Nhập số vào mảng");
            array[i] = scanner.nextInt();
        }
        for(int j = 0 ; j < array.length ; j ++){
            System.out.print(array[j] + " ");
        }
        int max = 0;
        for( int i = 0 ; i < array.length ; i ++){
            if( max < array[i] ){
                max = array[i];
            }
        }
        System.out.println("");
        System.out.println("Số lớn nhất là : " + max);

    }
}
