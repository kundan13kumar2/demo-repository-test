package threadingConcepts;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{

	private int delay;
	private CountDownLatch latch;
	private String threadName;
	public Worker(int delay,CountDownLatch latch,String threadName) {
		this.delay=delay;
		this.latch=latch;
		this.threadName=threadName;		
	}
	@Override
	public void run() {
		System.out.println("Current thread : "+this.threadName);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
		}
		latch.countDown();
		System.out.println("Finished thread : "+threadName);
	}

	
}
