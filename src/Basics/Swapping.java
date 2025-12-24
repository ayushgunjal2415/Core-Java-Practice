package Basics;

import java.util.Scanner;

public class Swapping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Swapping station!!\n");
        System.out.print("Enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter value of B: ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping done...");
        System.out.println("Value of A: " + a);
        System.out.println("value of B: " + b);
        sc.close();


    }
}