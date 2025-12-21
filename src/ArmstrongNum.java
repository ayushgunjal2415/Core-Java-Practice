import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to armstrong world..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        armstrong(num);
        sc.close();
    }

    public static void armstrong(int num) {

        int temp = num;
        int sum = 0;
        int lastdigit;

        // STEP 1: count digits
        int digitCount = 0;
        int countTemp = num;

        while (countTemp > 0) {
            digitCount++;
            countTemp /= 10;
        }

        // STEP 2: calculate Armstrong sum
        while (num > 0) {
            lastdigit = num % 10;
            sum += Math.pow(lastdigit, digitCount);     //Math.pow(base, power) It is used to raise a number to a power
            num /= 10;
        }

        // STEP 3: compare
        if (temp == sum) {
            System.out.println("Number is Armstrong..");
        } else {
            System.out.println("Not Armstrong number..");
        }
    }
}
