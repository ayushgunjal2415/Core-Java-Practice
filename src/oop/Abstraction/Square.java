package oop.Abstraction;

public class Square extends Shape{

    double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea(){
        return Math.pow(side, 2);
    }
}
