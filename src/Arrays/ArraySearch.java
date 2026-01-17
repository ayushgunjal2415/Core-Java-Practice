package Arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding max element in array..\n");
        System.out.print("Enter array sixe: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element number" + (i+1) + ": " );
            arr[i] = sc.nextInt();
        }

        int maxNum = maxNum(arr);
        System.out.println("Maximum value is: " + maxNum);
        sc.close();
    }

    public static int maxNum(int[] arr){
        int max = arr[0];
        for( int i : arr){
            if( i > max){
                max = i;
            }
        }
        return max;
    }
}
