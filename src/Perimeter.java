import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        float A = sc.nextFloat();
        System.out.print("Enter value of B: ");
        float B = sc.nextFloat();
        System.out.print("Enter value of C: ");
        float C = sc.nextFloat();
        System.out.print("Enter value of D: ");
        float D = sc.nextFloat();

        float perimeter = A + B + C + D;
        System.out.println("Perimeter of Rectangle: " + perimeter);
        sc.close();
    }
    
}
