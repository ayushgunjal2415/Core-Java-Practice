package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankWithdrawal {
    public static void withdraw(double balance, double amount) throws Exception{

        if( amount <= 0){
            throw new Exception("Invalid withdrawal amount");
        } else if(amount > balance){
            throw new Exception("Insufficient balance");
        } else {
            System.out.println("Withdrawal Successful..");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Banking World..\n");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdrawal Amount: ");
            double amount = sc.nextDouble(); 

           withdraw(balance, amount);

        } catch ( InputMismatchException e){

            System.out.println("Error: Please enter valid numbers");

        } catch (Exception e) {

            System.out.println("Exception handled: " + e.getMessage());

        } finally {

            System.out.println("Transaction completed..");

        }

        sc.close();
    }
}
