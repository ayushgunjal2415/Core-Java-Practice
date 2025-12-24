package Loops;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime World..\n");
        System.out.print("Enter your numben: ");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        if (isPrime) {
        System.out.println("Number is Prime ");
         } else{
            System.out.println("Number is not Prime");
         }
         sc.close();
    }

    public static boolean isPrime(int n){
        int i = 2;
        while ( i < n) {
            if ( n % i == 0){
                return false;
                } 
             i++;
        }
        return true;

     }

 }
    

