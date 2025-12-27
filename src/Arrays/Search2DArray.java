package Arrays;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2d search..\n");
        System.out.print("Enter array row size: ");
        int row = sc.nextInt();
        System.out.print("Enter array col size: ");
        int col = sc.nextInt();
        int [][] arr = new int[row] [col];

        //Asuming as array will be homogeneous
        int i = 0;
        while(i < row){                                       
            int j = 0;
            while(j < col){
                System.out.print("The element row: " +(i+1)+ ", column: " +(j+1)+ " is: ");
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        System.out.print("Enter no you want to search: ");
        int num = sc.nextInt();

        boolean isFound = search(arr, num);
        if(isFound){
            System.out.println("Your number was found..");
        } else {
            System.out.println("Your number was not found..");
        }
        sc.close();
    }  
    
    
    public static boolean search(int [][] arr, int num){
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while(j< arr[i].length){
                if(arr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
