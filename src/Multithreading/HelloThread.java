package Multithreading;

public class HelloThread extends Thread {

    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
       for (int i = 0; i < 10; i++){
        System.out.println("Hello from Thread " + threadNumber);
       }
    }

    public static void main(String[] args) {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        t1.start();
        t2.start();

    }
}