package Arrays;

import java.util.Scanner;

public class PositiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to adding positive numbers..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element no " + (i+1)+ " : ");
            arr[i] = sc.nextInt();
        }

        //using continue for skipping negative numbers
        int sum = 0;
        for( int num : arr){
            if ( num < 0){
                continue;
            }
            sum += num;
        }

        System.out.println("The sum of positive numbers is: " + sum);
        sc.close();
    }
}
