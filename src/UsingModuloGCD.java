import java.util.Scanner;

public class UsingModuloGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to GCD World..\n");
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("GCD is: " + modulogcd(a, b));
        sc.close();
    }

    public static int modulogcd(int a, int b){
        while (b!=0){                              //Run until remainder becomes 0

            int rem = a % b;                       //Find remainder
            a = b;                                 // Replace a value with b
            b = rem;                               //Put rem value in b and repeat loop until b becomes 0
        }                                          //Ii is the fastest way to find GCD which also a EUCLID's Algo  }
        return a;                                   //Return a value which is gcd after b(rem) becomes 0
    }
}
