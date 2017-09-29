package ExceptionStudyThread;

public class yieldDemo
{
    public static void main(String[]args)
    {
        YieldThread t = new YieldThread();
        t.start();
 
        for (int i=0; i<5; i++)
        {
            // Control passes to child thread
            Thread.yield();
 
            // After execution of child Thread
            // main thread takes over
            System.out.println(Thread.currentThread().getName()
                                + " in control");
        }
    }
}