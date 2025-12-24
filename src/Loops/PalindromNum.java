package Loops;

import java.util.Scanner;

public class PalindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome World..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome){
            System.out.println("Number is Palindrome..");
        } else {
            System.out.println("Number is not Palindrome..");
        }

        sc.close();

    }

    public static int reverseNum(int num){
        int rev = 0;
        while (num > 0){
            int lastdigit = num % 10;
            rev = rev * 10 + lastdigit;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num){
       return num == reverseNum(num);
    }
}
