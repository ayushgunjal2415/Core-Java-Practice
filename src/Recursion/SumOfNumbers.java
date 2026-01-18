package Recursion;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of numbers world..\n");
        System.out.print("Enter no till you want the sum: ");
        int num = sc.nextInt();
        System.out.println("Sum of numbers is: " + sumOfNumbers(num));
        sc.close();
    }

    public static int sumOfNumbers(int num){
        if(num == 0){
            return 0;
        }
        return num + sumOfNumbers(num - 1);
    }
}
