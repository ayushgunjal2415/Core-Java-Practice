package Arrays;

import java.util.Scanner;

public class SecondLargestInArray {
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

        int result = findSecondLargest(arr);
        if(result != -1){
            System.out.println("Second Largest number is: " + result);
        }
    
        sc.close();
    }

    public static int findSecondLargest(int[] arr){

        //edge case
        if(arr.length < 2){
            System.out.println("Second Largest not posible..");
            return -1;                   //method must return something 
        }

        int largest;
        int secondLargest;

        //initialize using first two elements
        if(arr[0] > arr[1]){
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }

        int i = 2;
        while( i < arr.length){
            if ( arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } 
            else if ( arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
              }
              i++;
            }

            return secondLargest;
        }
    }
