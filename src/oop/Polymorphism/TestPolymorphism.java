package oop.Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Parent obj = new Child();   // upcasting

        System.out.println(obj.rate); // variable access
        obj.display();               // method call
    }
}