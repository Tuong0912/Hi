# Hi

import java.util.Scanner;

public class Hien20SNT {
    public static void main(String[] args)
    {
        System.out.println("20 số nguyên tố đầu tiên :");
        Scanner scanner = new Scanner(System.in);
        int dem = 0;
        for (int i = 2; i < 100; i++){
            int check = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check += 1;
                }
            }
            if (check == 1){
                dem += 1;
                System.out.println(i);
            }
            if (dem == 20){
                break;
            }
        }
    }
}
