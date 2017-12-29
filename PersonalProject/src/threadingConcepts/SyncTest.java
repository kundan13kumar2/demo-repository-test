package threadingConcepts;

public class SyncTest {

	public static void main(String[] args) {
		ThreadSender th=new ThreadSender();
		Thread t1=new Thread(new T1("Hi",th));
		Thread t2=new Thread(new T1(" Bye ",th));
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
