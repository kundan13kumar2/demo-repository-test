package ExceptionStudyThread;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) throws InterruptedException {
		Semaphore sem=new Semaphore(1);
		SemThread t1=new SemThread("A", sem);
		SemThread t2=new SemThread("B", sem);
		SemThread t3=new SemThread("C", sem);
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		
		
		System.out.println("Shared Counter : "+Shared.count);
	}

}
