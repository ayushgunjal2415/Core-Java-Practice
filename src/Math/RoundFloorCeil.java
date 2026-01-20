package Math;

import java.util.Scanner;

public class RoundFloorCeil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();

        long rounded = Math.round(num);
        double ceil = Math.ceil(num);
        double floor = Math.floor(num);

        System.out.println("Original number : " + num);
        System.out.println("Math.round()    : " + rounded);
        System.out.println("Math.ceil()     : " + ceil);
        System.out.println("Math.floor()    : " + floor);

        sc.close();
    }
}
