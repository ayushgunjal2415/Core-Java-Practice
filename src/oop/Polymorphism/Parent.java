package oop.Polymorphism;

class Parent {
    int rate = 10;

    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    int rate = 20;

    void display() {
        System.out.println("Child display");
    }
}


