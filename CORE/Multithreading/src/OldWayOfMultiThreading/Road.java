package OldWayOfMultiThreading;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
    }
}
 enum TrafficColor {
    RED(12000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMilli;

    public int getOnTimeInMilli() {
        return onTimeInMilli;
    }

    TrafficColor(int onTimeInMilli) {
        this.onTimeInMilli = onTimeInMilli;
    }
}
class TrafficLightThread extends Thread {

    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOnTimeInMilli());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", color);
    }
}