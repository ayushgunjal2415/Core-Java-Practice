package Ifelse;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to grade calculator..\n");
        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();

        if(percentage >= 90){
            System.out.println("Execellent! You have got A grade");
        }
        else if(percentage >= 75){
            System.out.println("Good! You have got B grade");
        }
        else if(percentage >= 60){
            System.out.println("You have got C grade");
        }
        else if(percentage >= 30){
            System.out.println("You have got D grade");
        }
        else {
            System.out.println("Failed! You have got F grade");
        }
        sc.close();
        
    }
}
