package Multithreading;

public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {
         
        ThreadState t1 = new ThreadState();

        System.out.println("Created the Thread " + t1.getState());

        t1.start();
        t1.join();

        System.out.println("Thread Finished " + t1.getState());
    }
}