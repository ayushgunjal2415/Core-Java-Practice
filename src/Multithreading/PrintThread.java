package Multithreading;

public class PrintThread extends Thread{
     private final int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
       System.out.println(Thread.currentThread().getName() 
       + " "
       +"Thread Starting-"   
       + threadNumber);

       try {
        Thread.sleep(5000);
       } catch ( InterruptedException e){
        throw new RuntimeException();
       }

       System.out.println(Thread.currentThread().getName() 
       + " "
       +"Thread Ended-"   
       + threadNumber);
       
    }
}
