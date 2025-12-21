import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter value of b: ");
        float b = sc.nextFloat();
        float product = a*b;
        System.out.println(product);
        sc.close();

    }
    
}
