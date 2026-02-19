package Multithreading;

public enum TrafficColor {
    
    RED(9000),
    YELLOW(2000),
    GREEN(4000);

    private final int onTimeInMills;

    public int getOnTimeInMills() {
        return onTimeInMills;
    }

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }

}
