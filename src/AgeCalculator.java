import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Welcome to our Age Calculator..\n");
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        if (age >= 60){
            System.out.println("You are Senior Citizen");
        }
        else if(age >=20){
            System.out.println("You are an adult");
        }
        else if(age >= 13){
            System.out.println("You are a teen ager");
        }
        else {
            System.out.println("You are are a child");
        }
        sc.close();
    }
}
