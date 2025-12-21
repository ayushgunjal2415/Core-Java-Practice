import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci world..\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.print("Fibonacci series: ");
        fibonacci(num);
        sc.close();
    }


    public static void fibonacci(int num){

        if (num < 0) return;                  //for invalid num fucntion stops 
        System.out.print("0 ");           //fibonacci always starts with 0 that's why 0 is printed    
        if ( num == 0) return;              //if num is 0 then here fuction stops because 0 is already printed
        System.out.print("1 ");         //if num is greater than 1 then 1 will print and next conditions will be checked

        int a = 0; 
        int b = 1;

        while ( a + b <= num ){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
