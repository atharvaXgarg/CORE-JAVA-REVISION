package OldWayOfMultiThreading;

class Counter{
    private int count;
//    public  void inc(){
//        count++;
//    } if we don't use synchronized keyword than original o/p may be less
    /// synchronized means only one thread could access at a time
    /// and update of variable visibility should be public
    /// in above code if both thread has seen same value, so they both are
    /// incrementing the value by 1 so final value inc by 2 but inc by 1 only
    ///
    public synchronized void inc(){
        count++;
    }
    public  int getCount(){
        return count;
    }
}
class SyncronizedThread extends Thread{
    private Counter counter;
    public SyncronizedThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            counter.inc();
        }
    }
}
public class Synchronized_keyword {
    public static void main(String[] args) throws InterruptedException {
        Counter cc1 = new Counter();
        SyncronizedThread thread1 = new SyncronizedThread(cc1);
        SyncronizedThread thread2 = new SyncronizedThread(cc1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(cc1.getCount());
    }
}