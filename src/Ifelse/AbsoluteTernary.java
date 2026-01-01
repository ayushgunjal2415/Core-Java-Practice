package Ifelse;

import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int result = ( num >= 0 ) ? num : -num ;
        System.out.println("Absolute value is: " + result);
        sc.close();
    }
}
