package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to printing fibonacci series..\n");
        System.out.print("Enter no of element to be printed: ");
        int n = sc.nextInt();
        
        for( int i = 0; i < n; i++){
            System.out.print(fibo(i) + " ");
        }
        sc.close();
    }

    //recursive method
    public static int fibo(int n){
        //Base cases
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
