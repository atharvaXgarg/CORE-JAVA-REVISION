package OldWayOfMultiThreading;

class TestSleep{
    static void main() throws InterruptedException {
        System.out.println("Before sleeping");
        Thread.sleep(10_000);
        System.out.println("\nwake up man");

    }
}