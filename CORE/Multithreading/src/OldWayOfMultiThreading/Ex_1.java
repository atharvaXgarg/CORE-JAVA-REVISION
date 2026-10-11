package OldWayOfMultiThreading;

class helloWorld extends Thread {
    private final int threadNumber;
    public helloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.printf("hello from %d \n", threadNumber);
        }
    }
}
public class Ex_1 {
    public static void main(String[] args) throws InterruptedException {
        helloWorld hw = new helloWorld(1);
        hw.start();
        helloWorld hw2 = new helloWorld(2);
        hw2.start();

        hw2.join();
        hw.join();
    }
}