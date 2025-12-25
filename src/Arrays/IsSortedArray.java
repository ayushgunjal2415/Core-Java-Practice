package Arrays;

import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sorted array check post..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        int i = 0;
        while(i < size){
            System.out.print("The element no "+ (i+1)+ " is: ");
            arr[i] = sc.nextInt();
            i++;
        }

        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);
        
        if(isInc || isDec){
            System.out.println("The array is sorted..");
        } else {
            System.out.println("The array is not sorted..");
        }

        sc.close();
    }

    public static boolean isIncreasing(int [] arr){
        int i = 0;
        while(i<arr.length -1){
            if( arr[i] > arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int [] arr){
        int i = 0;
        while(i<arr.length-1){
            if( arr[i] < arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
