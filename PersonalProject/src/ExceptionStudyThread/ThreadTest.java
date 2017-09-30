package ExceptionStudyThread;

public class ThreadTest extends Thread implements Runnable
{
    public void run()
    {
        System.out.printf("GFG ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        /*Thread thread1 = new Thread(new Test());
        thread1.start();
        thread1.start();
        System.out.println(thread1.getState());*/
    	
    	ThreadTest obj = new ThreadTest();
        obj.run();
        System.out.println("After run called!!");
        obj.start();
    }
}
