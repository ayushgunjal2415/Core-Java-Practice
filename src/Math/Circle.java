package Math;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the world of Circle..\n ");
    System.out.print("Enter radius value: ");
    double radius = sc.nextDouble();

     double area = Math.PI * Math.pow(radius, 2);
     System.out.println("Area of circle is : " + area);

     double circumference = 2 * Math.PI * radius;
     System.out.println("Circumference of circle is: " + circumference);
     sc.close();

        
    }


}
