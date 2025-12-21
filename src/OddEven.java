import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to odd even calculator.. \n");
        System.out.print("Enter your num: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is even!");
        }
        else {
            System.out.println("Number is odd!");
        }
        sc.close();

    }
    
}
