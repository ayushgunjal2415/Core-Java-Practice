package Arrays;

import java.util.Scanner;

public class SumOfDiagonals {
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
        long sum = sumOfDiagonals(arr);
        System.out.println("Sum of two diagonals is: "+ sum);
        sc.close();
    }

    public static long sumOfDiagonals(int[][] arr){
        long leftSum = sumOfLeftDiagonals(arr);
        long rightSum = sumOfRightDiagonals(arr);
        long sum = leftSum + rightSum;

        //if arr size is odd so middle element is add two times that's why that element is minus 
        if(arr.length % 2 != 0){    
            int ind = arr.length/2;
            sum -= arr[ind][ind];
        }
        return sum;
    }

    
    public static long sumOfLeftDiagonals(int[][] arr){
        long sum = 0;
        int i = 0;
        while ( i < arr.length){
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

    
    public static long sumOfRightDiagonals(int[][] arr){
        long sum = 0;
        int i = 0;
        while( i < arr.length){
            int col = arr.length - 1 - i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }
}
