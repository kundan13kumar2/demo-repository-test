package ExceptionStudyThread;

import java.util.concurrent.Semaphore;

class Shared 
{
    static int count = 0;
}
public class SemThread extends Thread{
	private String threadName;
	private Semaphore sem;
	public SemThread(String threadName, Semaphore sem) {
		super();
		this.threadName = threadName;
		this.sem = sem;
	}
	@Override
	public void run()
	{
		if(Shared.count<=0)
		{
			System.out.println(" Thread acuired the lock : "+threadName);
			try {
				sem.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<5;i++)
			{
				Shared.count++;
				System.out.println("Remaining count available : "+Shared.count);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sem.release();
		}
		
	}
	
}
