package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 class Factorial implements Callable<Integer>{
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if (num== 0 || num == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= num; i++) {
           result *= i; 
        }
        return result;
    }
    
}


public class FactorialCalculator{
    public static void main(String[] args) throws ExecutionException, InterruptedException{

       ExecutorService service = Executors.newFixedThreadPool(3);

        List<Future<Integer>> list = new ArrayList<>();

        // Submit tasks
        for (int i = 0; i < 10; i++) {
            Factorial task = new Factorial(i);
            Future<Integer> future = service.submit(task);
            list.add(future);
        }

        // Get results
        for (Future<Integer> future : list) {
            System.out.println("Result is: " + future.get());
        }

        service.shutdown();
    }
}