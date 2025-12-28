package Ifelse;

import java.util.Scanner;

public class EvenOddDivMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to even odd finder..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if( (num/2) * 2 == num){
            System.out.println("Number is even..");
        } else{
            System.out.println("Number is odd..");
        } 
        sc.close();
    }
}
