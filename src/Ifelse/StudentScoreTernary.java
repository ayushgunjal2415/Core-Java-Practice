package Ifelse;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Score..\n");
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String category = (marks > 80) ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your Category is: " + category);
        sc.close();

    }
}
