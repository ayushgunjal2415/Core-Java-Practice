package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to reverse world..\n");
        System.out.print("Enter your string that want be reverse: ");
        String s = sc.next();
        String rev = reverse(s);
        System.out.println("Reverse string is: " + rev);
        sc.close();
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();

         for( int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
         }

         return sb.toString();
   }

}

