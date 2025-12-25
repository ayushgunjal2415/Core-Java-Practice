package Arrays;

import java.util.Scanner;

public class OccurencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurence..\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int [size];

        //input
        int i = 0;
        while (i< size){
            System.out.print("Enter element no " + (i+1)+ " :");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter num you want to find: ");
        int num = sc.nextInt();
        
        int occurrence = noOfOcuurences(arr, num);
        System.out.println("Your element was found "+ occurrence +" times ");
        sc.close();
    }
    
    //Finding occurence in array
    public static int noOfOcuurences(int arr [], int num){
        int occ = 0;
        int i = 0;
        while( i < arr.length){
            if (arr [i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
