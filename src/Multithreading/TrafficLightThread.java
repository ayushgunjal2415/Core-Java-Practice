package Multithreading;

public class TrafficLightThread extends Thread {
    
    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color + " Active");
        try{
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e){
            throw new RuntimeException();
        }

        System.out.println(color + " Inactive");
    }
}
