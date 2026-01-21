package Strings;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to replacing world..\n");
        System.out.print("Enter your string: ");
        String s = sc.nextLine();

        System.out.print("Enter char to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new char: ");
        char newChar = sc.next().charAt(0);

        String result = s.replace(oldChar, newChar);
        System.out.printf("Updated String is: %s", result);
        
        sc.close();
    }
}
