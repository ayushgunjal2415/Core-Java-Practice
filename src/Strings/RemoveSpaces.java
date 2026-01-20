package Strings;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for( int i = 0; i < s.length(); i++){
            
            if ( s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }

        System.out.println("String after spaces removed: " + sb.toString());

        sc.close();
    }
}
