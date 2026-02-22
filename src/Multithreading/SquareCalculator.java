package Multithreading;

import java.util.concurrent.*;

class Square implements Callable<Integer> {

    private int number;

    public Square(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + 
                           " is calculating square of " + number);
        Thread.sleep(1000);
        return number * number;
    }
}

public class SquareCalculator {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(1);

        // Creating multiple Callable tasks
        Callable<Integer> task1 = new Square(2);
        Callable<Integer> task2 = new Square(4);
        Callable<Integer> task3 = new Square(6);

        // Submit tasks
        Future<Integer> f1 = service.submit(task1);
        Future<Integer> f2 = service.submit(task2);
        Future<Integer> f3 = service.submit(task3);

        // Get results
        System.out.println("Result 1: " + f1.get());
        System.out.println("Result 2: " + f2.get());
        System.out.println("Result 3: " + f3.get());

        service.shutdown();
    }
}