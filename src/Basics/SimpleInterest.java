package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Simple interest calculator...\n");
        System.out.print("Enter principle amount: ");
        int principle = sc.nextInt();
        System.out.print("Enter rate of interest:  ");
        float rate = sc.nextFloat();
        System.out.print("Enter time period in years: ");
        float time = sc.nextFloat();
        double SimpleInterest = (principle * rate * time) / 100;
        System.out.println("Your Simple Interest is: " + SimpleInterest);
        sc.close();

    }
}