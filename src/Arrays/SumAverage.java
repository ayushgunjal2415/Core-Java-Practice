package Arrays;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int [size];

        int i = 0;
        while ( i < size){
            System.out.print("Enter elements no " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        long sum = sum(arr);
        long avg = average(arr);
        
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + avg);
        sc.close();
    }

    public static long sum(int[] arr){
        long sum = 0;
        int i = 0;
        while (i < arr.length){
            sum+= arr[i];
            i++;
        }
        return sum;
    }

    public static long average (int[] arr){
        long avg = 0;
        long sum = sum(arr);
        avg = sum/arr.length;
        return (int) avg;
    }
    
}
    
