import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Base: ");
        double B = sc.nextDouble();
        System.out.print("Enter value of hieght: ");
        Double H = sc.nextDouble();
        Double Area = 0.5 * B * H;
        System.out.println("Area of triangle: " + Area);
        sc.close();


    }
}