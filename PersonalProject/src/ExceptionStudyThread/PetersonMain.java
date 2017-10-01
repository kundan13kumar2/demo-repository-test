package ExceptionStudyThread;

public class PetersonMain {
	public static void main(String[] args) throws InterruptedException {
		PetersonThread petersonThread=new PetersonThread();
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				petersonThread.fun(0);
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				petersonThread.fun(1);
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t1.join();
		
		System.out.println("Actual count of ans : "+petersonThread.ans);
	}

}
