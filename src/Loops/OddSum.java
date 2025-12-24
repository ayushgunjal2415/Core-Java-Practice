package Loops;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to OddSum..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till " + num + " is: " + sum );
        sc.close();
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while( i <= num) {
            sum += i;
            i += 2;
        }
        return sum;

    }
}