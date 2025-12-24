package Basics;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to temperature converter: \n");
        System.out.print("Enter your temp in F: ");
        float Fah = sc.nextFloat();
        float celcius = (Fah - 32) * 5.0f / 9.0f;
        System.out.println("Your temp is: " + celcius + " C");
        sc.close();
    }
    
}
