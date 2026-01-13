package Loops;

import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number guessing game..\n");
        int num = 6;
        int guess;

        do{
            System.out.print("Guess a number between 1 to 10: ");
            guess = sc.nextInt();
        } while ( num != guess);
        System.out.println("You have successfully guessed the number..");
        sc.close();
    }
}