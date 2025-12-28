package Arrays;

import java.util.Scanner;

public class EvenOddCountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WElcome to Even Odd Count of Array..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element no "+ (i+1)+ " : ");
            arr [i] = sc.nextInt();
            i++;
        }
        int[] result = countEvenOdd(arr);
        System.out.println("Even numbers: " + result[0]);
        System.out.println("Odd numbers: " + result[1]);

        sc.close();
    }

    public static int[] countEvenOdd(int[] arr){
        int i = 0;
        int even = 0 , odd = 0;
        while ( i < arr.length){
            if ( arr[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
            i++;
        }
        return new int[]{even,odd};
    }
}
