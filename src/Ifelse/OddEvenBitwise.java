package Ifelse;

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Welcome to Odd Even Calculator using Bitwise Opr..\n");
        System.out.print("Enter your num: ");
        int num = sc.nextInt();

        if ((num & 1) == 1){                        
            System.out.println("Number is Odd!");
        }else {
            System.out.println("Number is Even!");
        }
        sc.close();
    }
}

// (num & 1) It checks only last bit of num 
//if it is same means 1 and 1 then it is odd
// otherwise it is even because if if num's last bit 0 then it results in true that is 0 (in & opr 0 1 is 0) and (1 1 is 1)


// num = 5
// Binary of 5 = 0101
// Binary of 1 = 0001
// num & 1 = 0001  → 1
// Last bit is 1 → odd

// num = 4
// Binary of 4 = 0100
// Binary of 1 = 0001
// num & 1 = 0000 → 0
// Last bit is 0 → even

// ((num & 1) == 1)
// True → number is odd
// False → number is even
