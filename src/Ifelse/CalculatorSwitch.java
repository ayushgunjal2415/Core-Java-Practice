package Ifelse;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator..\n");
        System.out.print("Emter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Emter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Now, enter the operation: ");
        String operation = sc.next();

        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("Your result is: " + result);

        sc.close();
    }
    
}
