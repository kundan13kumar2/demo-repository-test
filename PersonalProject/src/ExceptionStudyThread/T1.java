package ExceptionStudyThread;

public class T1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Current Thread 1 : "+Thread.currentThread().getName());
		
	}
}
