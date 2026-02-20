package Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {

    private int taskNumber;

    public MyTask(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskNumber +
                " is running by " +
                Thread.currentThread().getName());
    }
}

public class TestExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            MyTask task = new MyTask(i);
            executor.execute(task);
        }

        executor.shutdown();
    }
}