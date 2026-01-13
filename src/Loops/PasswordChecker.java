package Loops;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to password checker..\n");
        String password;
        do{
            System.out.print("Enter your password: ");
            password = sc.next();
        } while (!isValidPass(password));
        
        System.out.println("Thanks for entering valid password..");
        sc.close();
    }

    public static boolean isValidPass(String password){

        return password.length() > 6;
    }
}
