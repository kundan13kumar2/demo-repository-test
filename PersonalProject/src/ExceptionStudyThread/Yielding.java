package ExceptionStudyThread;

public class Yielding {

	public static void main(String[] args) throws InterruptedException {
		String currentThread=Thread.currentThread().getName();
		Thread t1=new Thread(new T1());
		Thread t2=new Thread(new T2());
		t2.setPriority(2);
		t1.start();
		t2.start();
		t2.join(2000);
		System.out.println("State of thread 2 : "+Thread.currentThread().getName());
	}
}
