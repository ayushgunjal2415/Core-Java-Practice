package Arrays;

import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Finding Max & Min Element world..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        //print elements
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element no " + (i+1)+ " is: ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("The Max element is: "+ maxNum(arr));
        System.out.println("The Min element is: " + minNum(arr));
        sc.close();
    }

    public static int maxNum (int [] arr){
        int i = 1;
        int max = arr[0];
        while (i < arr.length){
            max = Math.max(arr[i],max);
            i++;
        }
        return max;
    }

    public static int minNum(int [] arr){
        int i = 1;
        int min = arr[0];
        while (i < arr.length){
            min = Math.min(arr[i],min);
            i++;
        }
        return min;
    }
}
