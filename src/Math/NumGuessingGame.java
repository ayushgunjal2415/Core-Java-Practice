package Math;

import java.util.Scanner;

public class NumGuessingGame {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wlecome to number guessing world..\n");
        int secretNum = (int) Math.ceil(Math.random()*100);

        int guess;
        int attempts = 0;

        do{
            System.out.print("Enter your guess from 0 to 100: ");
            guess = sc.nextInt();
            attempts++;

            if( guess > secretNum){
                System.out.println("Too high!");
            } else if( guess < secretNum){
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while( guess != secretNum);

        sc.close();
     }
}


/**
 * Number Guessing Game
 *
 * Generates a random number between 0 and 100 and allows the user
 * to guess the number. The program gives feedback if the guess is
 * too high or too low and continues until the correct number is guessed.
 *
 * Uses Math.random() and Math.ceil() for number generation.
 */
