package Arrays;

import java.util.Scanner;

public class DeleteFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to array deletion..\n");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        int i = 0;
        while (i < arr.length) {
            System.out.print("The element no " + (i + 1) + " is: ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("Now, enter num you want to delete: ");
        int numToDelete = sc.nextInt();

        int[] newArr = deleteArray(arr, numToDelete);

        System.out.println("Here is your new array:");
        displayArray(newArr);

        sc.close();
    }

    public static int[] deleteArray(int[] arr, int numToDelete) {

        int occ = OccurencesArray.noOfOcuurences(arr, numToDelete);

        if (occ == 0) {
            return arr;
        }

        int[] newArr = new int[arr.length - occ];

        int i = 0, j = 0;

        while (i < arr.length) {
            if (arr[i] != numToDelete) {
                newArr[j] = arr[i];   
                j++;
            }
            i++;
        }
        return newArr;
    }

    public static void displayArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
