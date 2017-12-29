package threadingConcepts;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	public static void main(String[] args) throws InterruptedException {
	
		Semaphore sem=new Semaphore(1);
		Thread t1=new Thread(new MyThread(sem, "A"));
		Thread t2=new Thread(new MyThread(sem, "B"));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}
