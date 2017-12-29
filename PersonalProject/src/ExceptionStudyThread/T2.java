package ExceptionStudyThread;

public class T2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Current Thread 2 : "+Thread.currentThread().getName());
		System.out.println("Current Thread 2 : "+Thread.currentThread().getState());
		for(int i=0;i<10;i++){
			Thread.yield();
//		System.out.println("Current Thread 2 : "+Thread.currentThread().getState());
		
		}
	}
}
