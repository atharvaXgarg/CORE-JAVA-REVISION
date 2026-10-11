package OldWayOfMultiThreading;

class printTask implements Runnable{
    long startTime=System.currentTimeMillis();

    private char ch;
    public printTask(char ch){
        this.ch=ch;
    }
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.printf("%c%d ",ch,i);
        }long endTime=System.currentTimeMillis();
         System.out.printf("\n%c %s is completed in %d ms\n",ch,Thread.currentThread().getName(),(endTime-startTime));
    }
}
public class Way2Multi{
    public static void main(String[] args){
        printTask task1=new printTask('*');
        printTask task2=new printTask('@');
        printTask task3=new printTask('#');
        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        Thread thread3=new Thread(task3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}