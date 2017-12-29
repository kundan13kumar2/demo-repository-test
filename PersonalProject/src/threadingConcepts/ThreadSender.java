package threadingConcepts;

public class ThreadSender {

	public synchronized void send(String msg){
		System.out.println("Sending : - "+ msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Message sent : "+msg);
	}
}
