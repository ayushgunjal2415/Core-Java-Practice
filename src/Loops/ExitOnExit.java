package Loops;

import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter your command: ");
            String s = sc.next();
            if ( s.equalsIgnoreCase("exit")){ //.equals() is used to compare the data in string obj
                break;  // break is used to stop the loop 
            }
        }
        System.out.println("You have successfully exited..");
        sc.close();
    }
}

