package Ifelse;

import java.util.Scanner;

public class EvenOddUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Even Odd Calculator\n");
        System.out.print("Emter your number: ");
        int num = sc.nextInt();

        String result = switch ( num % 2 ){
            case 0 -> "Even";
            case 1 -> "Odd";
            default -> "Invalid input";
        };
        System.out.println("Your number is: " + result);

        sc.close();
    }
}
