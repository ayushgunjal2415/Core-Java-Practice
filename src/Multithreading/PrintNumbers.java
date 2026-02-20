package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Numbers implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number is " + (i+1));
        }
        
    }
    
}

public class PrintNumbers{
    public static void main(String[] args) {
        
        ExecutorService service = Executors.newSingleThreadExecutor();

        Numbers num = new Numbers();

        service.execute(num);

        service.shutdown();
    }
}