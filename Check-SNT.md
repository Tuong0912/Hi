# Hi

import java.util.Scanner;

public class HienSNTbehon100 {
    public static void main(String[] args)
    {
        int lap;
        do
        {
            System.out.print("Nhập số muốn kiểm tra:");
            Scanner scanner = new Scanner(System.in);
            lap = scanner.nextInt();
            if (lap == 0)
            {
                System.out.println("Kết thúc chương trình");
                break;
            }
            int dem = 0;
            if (lap <= 1)
            {
                System.out.println("  không là số nguyên tố");
            } else
            {
                for (int i = 2; i < lap; i++)
                {
                    if (lap % i == 0)
                    {
                        dem += 1;
                    }
                }
                if (dem == 0)
                {
                    System.out.println(lap + " Là số nguyên tố");
                } else
                {
                    System.out.println(lap + " Không phải số nguyên tố");
                }
            }
        } while (lap != 0);
    }
}
