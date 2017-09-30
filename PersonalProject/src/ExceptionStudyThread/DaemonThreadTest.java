package ExceptionStudyThread;

public class DaemonThreadTest extends Thread{

	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()){
			System.out.println("Current thread is daemon thread!"+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("Current thread is user thread"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		DaemonThreadTest dt1=new DaemonThreadTest();
		DaemonThreadTest dt2=new DaemonThreadTest();
		dt1.setDaemon(true);
		dt1.start();
		dt2.start();
		dt2.setDaemon(true);
	}
	
}
