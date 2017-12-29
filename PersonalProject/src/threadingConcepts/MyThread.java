package threadingConcepts;

import java.util.concurrent.Semaphore;

public class MyThread implements Runnable{

	private Semaphore sem;
	private String threadName;
	
	public MyThread(Semaphore sem,String threadName) {
		this.sem=sem;
		this.threadName=threadName;
	}
	
	@Override
	public void run() {
		if(this.threadName.equals("A")){
			System.out.println("Starting : "+this.threadName);
			try{
				System.out.println(this.threadName+" waiting for a permit.");
				sem.acquire();
				System.out.println(this.threadName+" get permit.");
				for(int i=0;i<5;i++){
					Shared.count++;
					System.out.println(this.threadName+" : "+Shared.count);
					Thread.sleep(1000);
				}
			}
			catch(Exception e){
				
			}
			System.out.println(this.threadName+" release the thread");
			sem.release();
		}
		else
		{
			System.out.println("Starting : "+this.threadName);
			try{
				System.out.println(this.threadName+" waiting for a permit.");
				sem.acquire();
				System.out.println(this.threadName+" get permit.");
				for(int i=0;i<5;i++){
					Shared.count--;
					System.out.println(this.threadName+" : "+Shared.count);
					Thread.sleep(100);
				}
			}
			catch(Exception e){
				
			}
			System.out.println(this.threadName+" release the thread");
			sem.release();
		}
	}

}
