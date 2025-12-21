import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding greatest number..\n");
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the greatest number. ");
        }
        else if (num2 >= num3){
            System.out.println(num2 + " is the greatest number.");
        }
        else {
            System.out.println(num3 + " is the greatest number.");
        }
        
        sc.close();
    }
}