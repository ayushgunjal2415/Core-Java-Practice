package Arrays;

import java.util.Scanner;

public class OccurencesForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Occurence..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int [size];

        for( int i = 0; i < arr.length; i++){
            System.out.print("Enter element no " + (i+1)+ " :");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter num you want to find: ");
        int num = sc.nextInt();

        int occ = countOccurences(arr, num);
        System.out.println("Your element was found "+ occ +" times ");
        sc.close();
    }

    public static int countOccurences( int[] arr, int num){
        int occ = 0;
        for( int x : arr){
            if( x == num){
                occ++;
            }
        }
        return occ;
    }
}
