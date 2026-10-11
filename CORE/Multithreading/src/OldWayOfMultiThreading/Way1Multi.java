package OldWayOfMultiThreading;

class FirstTask extends Thread {
    long startTime=System.currentTimeMillis();
    public void run() {
        // task 1
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("\n%s *Thread completed in %d ms\n",Thread.currentThread().getName(),(endTime-startTime));
    }
}
class SecondTask extends Thread {
    long startTime=System.currentTimeMillis();
    public void run() {
        // task 2
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d@ ",i);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("\n%s @Thread completed in %d ms\n",this.getName(),(endTime-startTime));
    }
}
class ThirdTask extends Thread {
    long startTime=System.currentTimeMillis();
    public void run() {
        // task 3
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("\n%s $Thread completed in %d ms\n",this.getName(),(endTime-startTime));
    }
}
class Test{
    public static void main(String[] args) {

        System.out.println("starting 1st thread");
        FirstTask first = new FirstTask();
        System.out.println("starting 2nd thread");
        SecondTask second = new SecondTask();
        System.out.println("starting 3rd thread");
        ThirdTask third = new ThirdTask();
        first.start();// predefined method to start thread
        second.start();
        third.start();
        // works in parallel way
        System.out.println("\n main thread completed its execution");
        // in class we can directly use this.name()
        // for outside we use       Thread.currentThread().getName();

    }
}