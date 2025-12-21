import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of digits world..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Sum of digits is: " + result);
        sc.close();
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        int lastDigit = 0;
        while (num > 0) {
            lastDigit = num % 10;             // get last digit
            num /= 10;                        // remove last digit
            sum += lastDigit;               //  adds the lastdigits into sum
        }
        return sum;
    }
}
