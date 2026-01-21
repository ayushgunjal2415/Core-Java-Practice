package Strings;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to duplicate world..\n");
        System.out.print("Enter your string: ");
        String s = sc.next();
        findDuplicates(s);
        sc.close();
    }

    public static void findDuplicates(String s){
         // Convert string to character array
        char[] arr = s.toCharArray();

        // Pick one character at a time
        for (int i = 0; i < arr.length; i++) {

            // Skip characters already counted
            if (arr[i] == ' ')
                continue;

            int count = 1; // current character count

            // Compare with remaining characters
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;        // increase count
                    arr[j] = ' ';   // mark as counted
                }
            }

            // Print only duplicates
            if (count > 1) {
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }
    }
