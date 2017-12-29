package threadingConcepts;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(3);
		Thread t1=new Thread(new Worker(1000, latch, "W1"));
		Thread t2=new Thread(new Worker(2000, latch, "W2"));
		Thread t3=new Thread(new Worker(3000, latch, "W3"));
		
		t1.start();
		t2.start();
		t3.start();
		
		latch.await();
	}
}
