package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to anagram world..\n");
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter first string: ");
        String s2 = sc.next();

        if(isAnagram(s1, s2)){
            System.out.println("String is Anagram..");
        } else{
            System.out.println("String is not Anagram..");
        }
        sc.close();
    }

    public static boolean isAnagram(String s1, String s2){

        //edge case
        if ( s1.length() != s2.length())
            return false;

        //Both strings are converted in lower case and then to char array
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        
        //Both arrays sort
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
