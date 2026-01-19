package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to reverse world..\n");
        System.out.print("Enter number want to reverse: ");
        int n = sc.nextInt();
        reverse(n);
        sc.close();
    }

    public static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.print( n % 10);
        reverse(n / 10);
    }
}
