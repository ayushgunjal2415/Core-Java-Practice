package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to reverse world..\n");
        System.out.print("Enter your string that want be reverse: ");
        String s = sc.next();
        String r = "";
        int i = s.length() - 1;
        String rev = reverse(s, r, i);
        System.out.println("Reverse string is: " + rev);
        sc.close();
    }

    public static String reverse(String s, String r, int i){
        if ( i < 0){
            return r;
        }

        return reverse( s, r+s.charAt(i), i-1);
    }
}
