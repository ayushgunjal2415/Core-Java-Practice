package Loops;

import java.util.Scanner;

public class MultiTableUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to multiplication table world..\n");
      System.out.print("Enter your number: ");
      int num = sc.nextInt();
      MultiTableUsingForLoop.table(num);
      sc.close();
    }

    public static void table(int num){
        
        for( int i = 1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
