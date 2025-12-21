import java.util.Scanner;

 public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second no: ");
        int secondNum = sc.nextInt();
        int sum = firstNum  + secondNum ;
        System.out.println("Sum of two nums: " + sum );
        sc.close();
        
    }
    
}
