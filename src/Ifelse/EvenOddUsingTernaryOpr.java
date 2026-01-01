package Ifelse;

import java.util.Scanner;

public class EvenOddUsingTernaryOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Even Odd Calculator\n");
        System.out.print("Emter your number: ");
        int num = sc.nextInt();
    
        String result = ( num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Even number is: " + result);
        sc.close();
    }
}
