# Hi
import java.util.Scanner;

public class Ptbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        a = scanner.nextDouble();
        System.out.println("Nhập b");
        b = scanner.nextDouble();
        System.out.println("Nhập c");
        c = scanner.nextDouble();
        if(a != 0){
            double answer = (c - b)/a;
            System.out.println( "x =" + answer);
        }
        else
            if( b == c){
                System.out.println("Vô số nghiệm x");
            }
            else
                System.out.println("Vô nghiệm");
    }
}
