# Hi
import java.util.Scanner;

public class Timmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("");
        System.out.println("Số bé nhất là :" + min);
    }
}
