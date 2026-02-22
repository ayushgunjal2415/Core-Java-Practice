package FunctionalProgramming;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways..");
        int num = 9;

        //Functional Programming way
        IntStream.rangeClosed(2, num)
        .reduce((a,b) -> a * b)
        .ifPresent(System.out::println);

        System.out.println(fact(num));
    }

    //Structural programming way
    public static int fact(int num){

        if (num == 0 || num == 1){
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= num; i++) {
           fact *= i; 
        }
        return fact;
    }
}

// rangeClosed(2, num) → generates numbers 2 to num.
// reduce((a,b) -> a*b) → multiplies all numbers (factorial).
//ifPresent() prints value if present in stream
// Without identity → returns OptionalInt.