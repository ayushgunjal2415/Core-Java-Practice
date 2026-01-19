package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to factorial world..\n");
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print("Factorial is: " + factorial(n));
        sc.close();
    }

    public static int factorial(int n){
        //Base case
        if ( n == 0 || n == 1){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
