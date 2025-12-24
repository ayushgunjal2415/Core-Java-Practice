package Ifelse;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator..\n");
        System.out.print("Enter the year that you want to check: ");
        int year = sc.nextInt();

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
                System.out.println("Your year is a leap year");
            }
            else {
                System.out.println("Your year is not a leap year");
            }
        sc.close();
    }
    
}
    /*     if(year % 400 == 0){
            System.out.println("Your year is a leap year");
        } 
        else if (year % 100 == 0){
            System.out.println("Your year is not a leap year");
        }
        else if (year % 4 == 0){
            System.out.println("Your year is a leap year");
        }
        else {
            System.out.println("Your year is not a leap year");
        } */
