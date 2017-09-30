package ExceptionStudyThread;

public class ProducerConsumerProblem {
	public static void main(String[] args) throws InterruptedException {
		SharedResource resource = new SharedResource();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					resource.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					resource.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
        t2.start();
        
        t1.join();
        t2.join();
	}
}
