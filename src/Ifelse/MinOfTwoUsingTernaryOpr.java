package Ifelse;

import java.util.Scanner;

public class MinOfTwoUsingTernaryOpr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding min of two number\n");
        System.out.print("Emter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Emter second number: ");
        int num2 = sc.nextInt();

        int minNum = (num1 > num2) ? num2 : num1;
        System.out.println("Minimum number is: " + minNum);
        sc.close();
    }
}