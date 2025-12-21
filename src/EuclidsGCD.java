import java.util.Scanner;

public class EuclidsGCD {
     
 public static int euclidsgcd(int a, int b){
    while ( b != a){
        if (a>b){
            a = a-b;
        }
        else{
            b = b-a;
        }
    }
    return a;
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to GCD World..\n");
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("GCD is: " + euclidsgcd(a, b));
        sc.close();
    }
}

 /* This is Euclid's Algorithm..!!  This is using subtraction another one is using modulo
 1. Find the larger num
 2. Replace the the larger num by the diff between larger and smaller num
 3. Repeat the step 1 and 2 until both nums becomes equal 
 4. Then return any one value which is GCD.. */

