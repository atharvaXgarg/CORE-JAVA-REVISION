package OldWayOfMultiThreading;

class ThreadState extends Thread {
    @Override
    public void run() {

        try {
            Thread.sleep(4000);
            System.out.println("from inside run "+Thread.currentThread().getState());
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
}
class TestState{
    public static void main(String[] args) throws InterruptedException {
        ThreadState threadState = new ThreadState();
        System.out.println(threadState.getState());
        threadState.start();
        threadState.join();
        System.out.println("Thread 1 "+threadState.getState());
    }


}