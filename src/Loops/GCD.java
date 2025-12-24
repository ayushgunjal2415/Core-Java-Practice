package Loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to GCD..\n");
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println("GCD is: " + gcd);
        sc.close();
    }

   public static int gcd(int a, int b) {
    int min = Math.min(a, b);                 //find the min value
    int gcd = 1;                              //Initially, gcd = 1 because 1 divides every number               
    int i = 1;                                //i is used to check all numbers from 1 to min

    while (i <= min) {
        if (a % i == 0 && b % i == 0) {       //checks both are true
            gcd = i;                         // store latest common divisor
        }                                    
        i++;
    }
    return gcd;                              // return the greatest one
}
}  


// Note: GCD of two nums cannot be greater than smaller number
