package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Reversal..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int [size];
        
        int i = 0;
        while(i<size){
            System.out.print("The element no " +(i+1)+ " is: ");
            arr[i] = sc.nextInt();
            i++;
        }
        ReverseArray.reverse(arr);
        System.out.println("Your reverse array is: ");
        ReverseArray.displayArray(arr);

        sc.close();
    }

    public static void reverse(int[] arr){
            int i = 0;
            while ( i < arr.length/2){
                int swap = arr[i];
                arr[i] = arr[(arr.length-1) - i];
                arr[(arr.length-1) - i] = swap;
                i++;
            }
        }

        public static void displayArray(int[] arr){
            int i = 0;
            while( i < arr.length ){
                System.out.print(arr[i] + " ");
                i++;
            }
            System.out.println();
        }

}
