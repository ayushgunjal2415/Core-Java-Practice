package Multithreading;

import java.util.concurrent.*;

class Pizza implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Pizza is being prepared...");
        Thread.sleep(3000);   // preparing time
        return "Pizza Delivered!";
    }
}

public class OrderPizza {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Pizza p = new Pizza();

        System.out.println("Order placed... Waiting for delivery...");

        Future<String> future = service.submit(p);

        String result = future.get();   // waits until pizza ready

        System.out.println(result);

        service.shutdown();
    }
}