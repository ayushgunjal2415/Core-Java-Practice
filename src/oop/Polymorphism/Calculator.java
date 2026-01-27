package oop.Polymorphism;

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(5, 8));
        System.out.println(c.add(5, 8, 2));
        System.out.println(c.add(5.8, 8.5));
    }
}