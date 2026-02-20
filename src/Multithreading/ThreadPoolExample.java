package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SleepTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Running on : " + Thread.currentThread().getName());

       try {
        Thread.sleep(2000);
       } catch ( InterruptedException e){
        throw new RuntimeException();
       }
    }
    
}

public class ThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService service = Executors.newFixedThreadPool(2);

        SleepTask task = new SleepTask();

        for (int i = 0; i < 4; i++) {
            service.execute(task);
        }

        service.shutdown();

        // Wait for tasks to finish
        //If tasks not get completed within 5 sec then main thread will not wait, it will execute next line 
        service.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Finished..");
    }
}