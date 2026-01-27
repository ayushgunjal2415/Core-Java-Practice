package oop.Polymorphism;

class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getRateOfInterest() {
        return 7.0;
    }
}
