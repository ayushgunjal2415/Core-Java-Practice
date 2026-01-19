package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to palindrome world..\n");
        System.out.print("Enter string to be checked: ");
        String s = sc.next();
        int i = 0;
        int j = s.length() - 1;
        if(isPalindrome(s, i, j)){
            System.out.println("String is palindrome");
        } else{
            System.out.println("String is not palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(String s, int i, int j){
        if( s.charAt(i) != s.charAt(j)){
            return false;
        }
        //Base case
        if( j <= i){
            return true;
        }
        return isPalindrome(s, i+1, j-1);
    }
}
