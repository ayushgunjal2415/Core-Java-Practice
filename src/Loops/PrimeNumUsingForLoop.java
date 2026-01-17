package Loops;

import java.util.Scanner;

public class PrimeNumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime World..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Number is Prime..");
        }else{
            System.out.println("Number is not Prime..");
        }
        sc.close();
    }

    public static boolean isPrime(int num){

        for( int i = 2; i < num; i++){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}
