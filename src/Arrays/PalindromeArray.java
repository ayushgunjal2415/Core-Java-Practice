package Arrays;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Welcome to Array Palindrome..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int [size];
        
        int i = 0;
        while(i<size){
            System.out.print("The element no " +(i+1)+ " is: ");
            arr[i] = sc.nextInt();
            i++;
        }  
        if(isPalindrome(arr)){
            System.out.println("Array is Palindrome..");
        }  else {
            System.out.println("Array is not Palindrome..");
        }
        sc.close();
    }

    public static boolean isPalindrome(int[] arr){                
        int i = 0;
        while(i < arr.length/2){
            if( arr[i] != arr[arr.length - 1 - i]){        
                return false;
            }
            i++;
        }

        return true;
    }
}
