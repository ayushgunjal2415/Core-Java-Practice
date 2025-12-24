package Loops;

import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to multiplication table world..\n");
      System.out.print("Enter your number: ");
      int num = sc.nextInt();
      table(num);
      sc.close();
        
    }

    public static void table( int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;

        }
    }

}       