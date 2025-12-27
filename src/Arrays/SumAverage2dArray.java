package Arrays;

import java.util.Scanner;

public class SumAverage2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2d search..\n");
        System.out.print("Enter array row size: ");
        int row = sc.nextInt();
        System.out.print("Enter array col size: ");
        int col = sc.nextInt();
        int [][] arr = new int[row] [col];

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
        long sum =  sum(arr);
        double avg =  average(arr);
        System.out.println("Sum of 2D Array is: " + sum);
        System.out.println("Average of 2D Array is: " + avg);
        
        sc.close();
    }    

    public static long sum(int[][] arr){
        long sum = 0;
        int i = 0;
        while (i<arr.length){
            int j = 0;
            while (j<arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum; 
    }

    public static double average(int[][] arr){

        //if array is of size 0
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int column = arr[0].length;    //By Checking number of columns in first row it identifies the col length.. 
        double size = rows * column;
        
        return sum(arr)/size;
    }

}
