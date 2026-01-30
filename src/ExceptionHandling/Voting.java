package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Voting {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        System.out.print("Welcome to Voting World..\n");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);

            System.out.println("Voting process started");

        } catch ( InputMismatchException e){
            System.out.println("Error: Please enter valid integers only.");

        } catch (Exception e) {
           
            System.out.println("Exception handled: " + e.getMessage());
            
        } finally {
            
            System.out.println("Voting process ended");
        }   

        sc.close();
    }
}