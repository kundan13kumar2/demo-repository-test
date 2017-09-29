package ExceptionStudyThread;

public class thread implements Runnable
{
    public void run()
    {
        // moving thread2 to timed waiting state
        try
        {
            Thread.sleep(1500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        try
        {
            Thread.sleep(1500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("State of thread1 while it called join() method on thread2 -"+
            Test.thread1.getState());
        try
        {
            Thread.sleep(200);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }    
        System.out.println("State of thread1 when it has finished it's execution - " + 
                Test.thread1.getState());
    }
}
 