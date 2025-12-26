package Arrays;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Merging Sorted array..\n");

        // First array
        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        int i = 0;
        while (i < size1) {
            System.out.print("The element no " + (i + 1) + " is: ");
            arr1[i] = sc.nextInt();
            i++;
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        int j = 0;
        while (j < size2) {
            System.out.print("The element no " + (j + 1) + " is: ");
            arr2[j] = sc.nextInt();
            j++;
        }

        int[] merged = merge(arr1, arr2);

        System.out.println("Merged sorted array:");
        int k = 0;
        while (k < merged.length) {
            System.out.print(merged[k] + " ");
            k++;
        }

        sc.close();
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }
}
