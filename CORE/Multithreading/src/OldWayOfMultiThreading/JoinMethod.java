package OldWayOfMultiThreading;

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        printTask task1=new printTask('*');
        printTask task2=new printTask('@');
        printTask task3=new printTask('#');
        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        Thread thread3=new Thread(task3);
        System.out.println("\n thread0 start");
        thread1.start();
        System.out.println("\n thread1 start");
        thread2.start();
        thread2.join();// at this point the main thread will stop or wait until thread 2 die
        // join() --> wait for indefinite time until thread die
        // join(long millis) or join(long millis,int nano)--> wait till this much time
        System.out.println("\n thread2 start");
        thread3.start();
    }
}