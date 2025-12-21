import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to number checker.. \n\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Number is positive!");
        }
        else if (num==0){
            System.out.println("Number is Zero!");
        }
        else {
            System.out.println("Number is negative!");
        }
        sc.close();
    }
}