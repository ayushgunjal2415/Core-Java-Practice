package Strings;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome world..\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        s = s.toLowerCase();

        if(isPalindrome(s)){
            System.out.println("String is Palindrome.");
        }else{
            System.out.println("String is not Palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String s){

        int i = 0;
        int j = s.length()-1; 

        while ( i <= j){
            if( s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
