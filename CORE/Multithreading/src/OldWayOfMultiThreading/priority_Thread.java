package OldWayOfMultiThreading;

class myThread1 extends Thread{
    public void run(){
        // name of current thread
        Thread t=Thread.currentThread();
        System.out.printf("\n currently the %s thread is getting executed",t.getName());
        System.out.println("\nAnd its priority is "+t.getPriority());
    }
}
public class priority_Thread {
    public static void main(String[] args) {
        // creating Thread objects
        myThread1 t1=new myThread1();
        /**
         * By default thread priority=5
         */
        t1.start();
        myThread1 t2=new myThread1();
        t2.setPriority(3);
        t2.start();
        myThread1 t3=new myThread1();
        t3.setPriority(Thread.MIN_PRIORITY);/// Thread.MIN_PRIORITY==1
        t3.start();
        myThread1 t4=new myThread1();
        t4.setPriority(Thread.MAX_PRIORITY);// max priority =10
        t4.start();
        // it doesn't guarantee that it'll work according to priority but just suggest
    }
}