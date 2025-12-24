package Loops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reverse World..\n");
        System.out.print("Enter your numben: ");
        int n = sc.nextInt();
        System.out.println("Reverse number is: " + reverse(n));
        sc.close();
    }


    public static int reverse(int n){
        int rev = 0;
        int lastdigit = 0;
        while ( n > 0){
            lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n /= 10;
        }
        return rev;
    }
}
