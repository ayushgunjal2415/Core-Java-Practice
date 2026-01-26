package oop.Abstraction;

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        System.out.println("Area of circle is: " + c.calculateArea());

        Square s = new Square(6.5);
        System.out.println("Area of square is: " + s.calculateArea());
    }
}
