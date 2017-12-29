package threadingConcepts;

public class T1 implements Runnable{

	private String msg;
	ThreadSender sender;
	T1(String m,ThreadSender s)
	{
		msg=m;
		sender=s;
	}
	
	@Override
	public void run() {
		
		
			sender.send(msg);
	}

}
