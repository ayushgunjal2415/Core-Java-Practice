package Basics;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Compound interest calculator...\n");
        System.out.print("Enter principle amount: ");
        int principle = sc.nextInt();
        System.out.print("Enter rate of interest:  ");
        float rate = sc.nextFloat();
        System.out.print("Enter time period in years: ");
        float time = sc.nextFloat();
        double CompoundInterest = principle * Math.pow((1 + rate / 100), time);
        System.out.println("Your Compound Interest is: " + CompoundInterest);
        sc.close();
    }
    
}
