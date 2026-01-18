package Recursion;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print("Count of digits is: " + countDigits(n));
        sc.close();
    }

    public static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return countDigits(n/10) + 1;
    }
}
