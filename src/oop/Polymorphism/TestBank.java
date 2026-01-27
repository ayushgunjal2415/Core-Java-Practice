package oop.Polymorphism;

public class TestBank {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("Rate of interest: " + b.getRateOfInterest());

        b = new HDFC();
        System.out.println("Rate of interest: " + b.getRateOfInterest());
    }
}
